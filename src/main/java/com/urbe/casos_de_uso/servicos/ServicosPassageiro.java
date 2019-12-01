package com.urbe.casos_de_uso.servicos;

import com.urbe.entidades.Bairro;
import com.urbe.entidades.Viagem;

public class ServicosPassageiro
{
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
