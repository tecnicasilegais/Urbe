package com.urbe.casos_de_uso.politicas;

public class CalculoCustoViagemPromocaoViagemLonga extends CalculoCustoViagemBasico
{

	@Override
	public double descontoPromocaoSazonal()
	{
		int qtdadeBairros = cidade().bairrosPercorridos(rota()).size();
		double cb = calculoCustoBasico();
		if (qtdadeBairros > 2)
		{
			return cb * 0.1;
		}
		else
		{
			return 0.0;
		}
	}
}