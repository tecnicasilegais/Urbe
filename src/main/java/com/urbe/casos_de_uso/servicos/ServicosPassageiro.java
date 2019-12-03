package com.urbe.casos_de_uso.servicos;

import com.urbe.casos_de_uso.repositorios.IRepositorioBairros;
import com.urbe.casos_de_uso.repositorios.IRepositorioCidades;
import com.urbe.casos_de_uso.repositorios.IRepositorioPassageiros;
import com.urbe.entidades.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicosPassageiro
{
	private IRepositorioCidades cidades;
	private IRepositorioBairros bairros;
	private IRepositorioPassageiros passageiros;
	private ServicosMotorista motoristas;

	@Autowired
	public ServicosPassageiro(IRepositorioCidades cidades, IRepositorioBairros bairros, IRepositorioPassageiros passageiros,
	                          ServicosMotorista motoristas)
	{
		this.cidades = cidades;
		this.bairros = bairros;
		this.passageiros = passageiros;
		this.motoristas = motoristas;
	}

	public Viagem criarViagem(String cpf, String bairroOrigem, String bairroDestino, String formaPagamento, String categoriaVeiculo)
	{
		Retorno<Passageiro> passageiro = passageiros.obterPorCpf(cpf);
		//impl SelVeiculo + motorista
		

		Retorno<Cidade> cidade = cidades.obterPorNome("POO");
		//asserts primeiro
		Bairro origem = cidade.dados().bairro(bairroOrigem);
		Bairro destino = cidade.dados().bairro(bairroDestino);

		

		return null;
	}

	public Boolean avaliarMotorista(String cpfMotorista, int avaliacaoMotorista)
	{
		return false;
	}
}
