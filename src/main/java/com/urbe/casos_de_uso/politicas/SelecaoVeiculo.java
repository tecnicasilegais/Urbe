package com.urbe.casos_de_uso.politicas;

import com.urbe.entidades.FormaPagamento;
import com.urbe.entidades.Motorista;
import com.urbe.entidades.Passageiro;
import com.urbe.entidades.Retorno;

import java.util.List;

public class SelecaoVeiculo
{
	private SelecaoMotoristaVeiculo smv;

	private SelecaoVeiculo(SelecaoMotoristaVeiculo smv)
	{
		this.smv = smv;
	}

	public static SelecaoVeiculo criaSelecaoVeiculo(String tipo)
	{
		switch (tipo)
		{
			case "Padrao":
				return new SelecaoVeiculo(new SelecaoMotoristaVeiculoPadrao());
			case "AtendaCatInferior":
				return new SelecaoVeiculo(new SelecaoMotoristaVeiculoAtendaCatInferior());
			default:
				throw new IllegalArgumentException("Categoria de seleção de veículo inválida");
		}
	}

	public Retorno<Motorista> selecMotorista(Passageiro passageiro, FormaPagamento formaPgto, List<Motorista> motoristas, String categoriaVeiculo)
	{
		smv.passageiro(passageiro);
		smv.formaPgto(formaPgto);
		smv.motoristas(motoristas);
		smv.categoriaVeiculo(categoriaVeiculo);
		return smv.selecionaMotorista();
	}
}