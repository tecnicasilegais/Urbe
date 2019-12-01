package com.urbe.casos_de_uso.servicos;

import com.urbe.casos_de_uso.repositorios.IRepositorioBairros;
import com.urbe.casos_de_uso.repositorios.IRepositorioCidades;
import com.urbe.casos_de_uso.repositorios.IRepositorioPassageiros;
import com.urbe.entidades.Cidade;
import com.urbe.entidades.Passageiro;
import com.urbe.entidades.Viagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicosPassageiro
{
	private IRepositorioCidades cidades;
	private IRepositorioBairros bairros;
	private IRepositorioPassageiros passageiros;

	@Autowired
	public ServicosPassageiro(IRepositorioCidades cidades, IRepositorioBairros bairros, IRepositorioPassageiros passageiros,)
	{
		this.cidades = cidades;
		this.bairros = bairros;
		this.passageiros = passageiros;
	}

	public Viagem criarViagem(String cpf, String bairroOrigem, String bairroDestino, String formaPagamento, String categoriaVeiculo)
	{
		Passageiro passageiro = passageiros.recuperaPorCpf(cpf);
		Cidade cidade = cidades.recuperaPorNome("POO");
		//Motorista motorista = motoristas.recuperaPorNome("Marcelo");
	}

	public Boolean avaliarMotorista(String cpfMotorista, int avaliacaoMotorista)
	{
		return false;
	}
}
