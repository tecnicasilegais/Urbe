package com.urbe.entidades;

public class VeiculosFactory
{
	private static VeiculosFactory instancia = null;

	private VeiculosFactory() {}

	public static VeiculosFactory getInstance()
	{
		if (instancia == null)
		{
			instancia = new VeiculosFactory();
		}
		return instancia;
	}

	public Veiculo createInstance(String placa, String marca, String cor, String categoria)
	{
		switch (categoria)
		{
			case "SIMPLES":
				return new VeiculoSimples(placa, marca, cor);
			case "NORMAL":
				return new VeiculoNormal(placa, marca, cor);
			case "LUXO":
				return new VeiculoLuxo(placa, marca, cor);
		}
		return null;
	}
}
