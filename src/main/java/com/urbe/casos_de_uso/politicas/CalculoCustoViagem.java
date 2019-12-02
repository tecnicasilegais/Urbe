package com.urbe.casos_de_uso.politicas;

import com.urbe.entidades.Bairro;
import com.urbe.entidades.Cidade;
import com.urbe.entidades.Passageiro;
import com.urbe.entidades.Veiculo;
import com.urbe.entidades.geometria.Reta;

public abstract class CalculoCustoViagem
{
	private Cidade cidade;
	private Passageiro passageiro;
	private Bairro origem;
	private Bairro destino;
	private Veiculo veiculo;

	public void cidade(Cidade cidade)
	{
		this.cidade = cidade;
	}

	public void origem(Bairro origem)
	{
		this.origem = origem;
	}

	public void destino(Bairro destino)
	{
		this.destino = destino;
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

	public Bairro origem()
	{
		return origem;
	}

	public Bairro destino()
	{
		return destino;
	}

	public Passageiro passageiro()
	{
		return passageiro;
	}

	public Veiculo veiculo()
	{
		return veiculo;
	}

	public Reta rota()
	{
		return new Reta(origem.limites().pontoCentral(), destino.limites().pontoCentral());
	}

	public double custoViagem()
	{
		return calculoCustoBasico() +
				adicionalVeiculo() +
				adicionalDinamica() -
				descontoPontuacao() -
				descontoPromocaoSazonal();
	}

	public abstract double adicionalDinamica();

	public abstract double calculoCustoBasico();

	public abstract double adicionalVeiculo();

	public abstract double descontoPontuacao();

	public abstract double descontoPromocaoSazonal();
}
