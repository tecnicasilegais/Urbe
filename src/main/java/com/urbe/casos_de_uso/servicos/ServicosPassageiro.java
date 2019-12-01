package com.urbe.casos_de_uso.servicos;

import com.urbe.casos_de_uso.repositorios.IRepositorioBairros;
import com.urbe.casos_de_uso.repositorios.IRepositorioCidades;
import com.urbe.entidades.Bairro;
import com.urbe.entidades.Viagem;
import com.urbe.interfaces.persistencia.RepositorioBairros;
import com.urbe.interfaces.persistencia.RepositorioCidades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicosPassageiro
{
	private IRepositorioCidades cidades;
	private IRepositorioBairros bairros;

	@Autowired
	public ServicosPassageiro(RepositorioCidades cidades, RepositorioBairros bairros)
	{
		this.cidades = cidades;
		this.bairros = bairros;
	}

	public Viagem criarViagem(String cpf, String bairroOrigem, String bairroDestino, String formaPagamento, String categoriaVeiculo)
	{
		Bairro bOrigem;
		Bairro bDestino;
		Viagem viagem;
		return new Viagem(null, null, null, null, null, 0.0);
	}

	public Boolean avaliarMotorista(String cpfMotorista, int avaliacaoMotorista)
	{
		return false;
	}
}
