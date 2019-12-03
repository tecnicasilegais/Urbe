package com.urbe.casos_de_uso.servicos;

import com.urbe.casos_de_uso.politicas.CustoViagem;
import com.urbe.casos_de_uso.politicas.SelecaoVeiculo;
import com.urbe.casos_de_uso.repositorios.IRepositorioBairros;
import com.urbe.casos_de_uso.repositorios.IRepositorioCidades;
import com.urbe.casos_de_uso.repositorios.IRepositorioMotoristas;
import com.urbe.casos_de_uso.repositorios.IRepositorioPassageiros;
import com.urbe.entidades.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@Service
public class ServicosPassageiro
{
	private IRepositorioCidades cidades;
	private IRepositorioPassageiros passageiros;
	private IRepositorioMotoristas motoristas;

	@Autowired
	public ServicosPassageiro(IRepositorioCidades cidades, IRepositorioBairros bairros, IRepositorioPassageiros passageiros,
	                          IRepositorioMotoristas motoristas)
	{
		this.cidades = cidades;
		this.passageiros = passageiros;
		this.motoristas = motoristas;
	}

	public Viagem criarViagem(String cpf, String bairroOrigem, String bairroDestino, String formaPagamento, String categoriaVeiculo)
	{

		Retorno<Cidade> cidade = cidades.obterPorNome("POO");

		//#region Obtencao Passageiro
		Retorno<Passageiro> passageiro = passageiros.obterPorCpf(cpf);
		if (!passageiro.ok())
		{
			throw new IllegalArgumentException(passageiro.mensagem());
		}
		//#endregion

		//#region Forma formaPagamento
		FormaPagamento fpg;
		try
		{
			fpg = FormaPagamento.valueOf(formaPagamento);
		}
		catch (Exception ex)
		{
			throw new IllegalArgumentException("Forma de pagamento Inválida:" + formaPagamento);
		}

		//#endregion

		//#region Coleta dos Bairros
		Bairro origem = cidade.dados().bairro(bairroOrigem);
		if (origem == null)
		{
			throw new IllegalArgumentException("Bairro origem não encontrado: " + bairroOrigem);
		}
		Bairro destino = cidade.dados().bairro(bairroDestino);
		if (destino == null)
		{
			throw new IllegalArgumentException("Bairro destino não encontrado : " + bairroDestino);
		}

		//#endregion

		//#region Coleta Motorista

		//nessa versão estaremos usando apenas a SelecaoMotoristaVeiculoPadrao 

		List<Motorista> motorasDisponiveis = motoristas.listarMotoristas();

		Retorno<Motorista> motora = SelecaoVeiculo
				.criaSelecaoVeiculo("Padrao")
				.selecMotorista(passageiro.dados(), fpg, motorasDisponiveis, categoriaVeiculo);

		if (!motora.ok())
		{
			throw new IllegalArgumentException(motora.mensagem());
		}

		//#endregion

		//#region Calculo Custo Viagem
		String tipoCusto = "PromocaoViagemLonga";
		int[] dinamica = new int[]{6, 7, 8, 12, 13, 17, 18, 19};
		if (Arrays.stream(dinamica).anyMatch(t -> t == LocalTime.now().getHour()))
		{
			tipoCusto = "Dinamica";
		}
		else if (passageiro.dados().qtdAvaliacoes() >= 10)
		{
			tipoCusto = "DescontoQuantidadeViagens";
		}

		double custo = CustoViagem.criaCustoViagem(tipoCusto)
				.custoViagem(cidade.dados(), origem, destino, passageiro.dados(), motora.dados().veiculo());

		//#endregion

		return Viagem.novaViagem(1, cidade.dados(), origem, destino, motora.dados(), passageiro.dados(), custo);
	}

	public Boolean avaliarMotorista(String cpfMotorista, int avaliacaoMotorista)
	{
		Retorno<Motorista> motora = motoristas.obterPorCpf(cpfMotorista);
		if (!motora.ok())
		{
			throw new IllegalArgumentException(motora.mensagem());
		}

		motora.dados().avalia(avaliacaoMotorista);

		return true;
	}
}
