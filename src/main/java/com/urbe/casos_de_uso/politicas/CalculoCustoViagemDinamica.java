package com.urbe.casos_de_uso.politicas;

public class CalculoCustoViagemDinamica extends CalculoCustoViagemBasico
{

	@Override
	public double adicionalDinamica()
	{
		return (calculoCustoBasico() * 0.25);
	}

}