package com.urbe.casos_de_uso.politicas;

import com.urbe.entidades.Bairro;
import com.urbe.entidades.Cidade;
import com.urbe.entidades.Passageiro;
import com.urbe.entidades.Veiculo;

public class CustoViagem
{
	private CalculoCustoViagem ccv;

	private CustoViagem(CalculoCustoViagem ccv)
	{
		this.ccv = ccv;
	}

	public static CustoViagem criaCustoViagem(String tipo)
	{
		switch (tipo)
		{
			case "Basico":
				return new CustoViagem(new CalculoCustoViagemBasico());
			case "PromocaoViagemLonga":
				return new CustoViagem(new CalculoCustoViagemPromocaoViagemLonga());
			case "Dinamica":
				return new CustoViagem(new CalculoCustoViagemDinamica());
			case "DescontoQuantidadeViagens":
				return new CustoViagem(new CalculoCustoViagemDescontoQuantidadeViagens());
			default:
				throw new IllegalArgumentException("Categoria de custo de viagem invalida");
		}
	}

	public double custoViagem(Cidade cidade, Bairro origem, Bairro destino, Passageiro passageiro, Veiculo veiculo)
	{
		ccv.cidade(cidade);
		ccv.origem(origem);
		ccv.destino(destino);
		ccv.passageiro(passageiro);
		ccv.veiculo(veiculo);
		return ccv.custoViagem();
	}
}