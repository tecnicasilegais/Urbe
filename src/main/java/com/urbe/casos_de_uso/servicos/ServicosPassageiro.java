package com.urbe.casos_de_uso.servicos;

import com.urbe.entidades.Bairro;
import com.urbe.entidades.Viagem;

public class ServicosPassageiro
{
	public Viagem criarViagem(String cpf, String bairroOrigem, String bairroDestino, String formaPagamento, String categoriaVeiculo)
	{
		Bairro bOrigem = new Bairro();
		Bairro bDestino = new Bairro();
		Viagem viagem = new Viagem();
	}

	public Boolean avaliarMotorista(String cpfMotorista, int avaliacaoMotorista)
	{
	}
}
