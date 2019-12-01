package com.urbe.casos_de_uso.politicas;

import com.urbe.entidades.geometria.Reta;

public class CalculaCustoViagemBasico extends CalculoCustoViagem
{
	@Override
	public double calculoCustoBasico()
	{
		Reta reta = roteiro().rota();
		return getCidade().bairrosPercoridos(reta)
				.stream()
				.mapToDouble(b -> b.custoTransporte())
				.sum();
	}

	@Override
	public double adicionalVeiculo()
	{
		switch (veiculo().getClass().getName())
		{
			case "VeiculoSimples":
				return 0.0;
			case "VeiculoNormal":
				return calculoCustoBasico() * 0.1;
			case "VeiculoLuxo":
				Reta reta = roteiro().rota();
				int qtdBairros = cidade().bairrosPercoridos(reta).size();
				double percent = qtdadeBairros * 0.01;
				double cb = calculoCustoBasico();
				return cb * 0.1 + cb * percent;
			default:
				return 0.0;
		}
	}

	@Override
	public double descontoPontuacao()
	{
		return 0.0;
	}

	@Override
	public double descontoPromocaoSazonal()
	{
		return 0.0;
	}
}
