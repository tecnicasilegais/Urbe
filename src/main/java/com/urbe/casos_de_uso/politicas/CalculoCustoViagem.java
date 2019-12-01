package com.urbe.casos_de_uso.politicas;

import com.urbe.entidades.Cidade;
import com.urbe.entidades.Passageiro;
import com.urbe.entidades.Veiculo;

public abstract class CalculoCustoViagem
{
	private Cidade cidade;
	private Passageiro passageiro;
	private Veiculo veiculo;

	public void cidade(Cidade cidade)
	{
		this.cidade = cidade;
	}

	public void passageiro(Passageiro passageiro)
	{
		this.passageiro = passageiro;
	}

	public void veiculo(Veiculo veiculo)
	{
		this.veiculo = veiculo;
	}

	public Cidade cidade()
	{
		return cidade;
	}

	public Passageiro passageiro()
	{
		return passageiro;
	}

	public Veiculo veiculo()
	{
		return veiculo;
	}

	public double custoViagem()
	{
		return calculoCustoBasico() +
				adicionalVeiculo() -
				descontoPontuacao() -
				descontoPromocaoSazonal();
	}

	public abstract double calculoCustoBasico();

	public abstract double adicionalVeiculo();

	public abstract double descontoPontuacao();

	public abstract double descontoPromocaoSazonal();
}
