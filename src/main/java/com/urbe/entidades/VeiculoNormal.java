package com.urbe.entidades;

public class VeiculoNormal extends Veiculo
{
	private boolean atendeCategoriaInferior;

	public VeiculoNormal(String placa, String marca, String cor)
	{
		super(placa, marca, cor);
		this.atendeCategoriaInferior = true;
	}

	public boolean atendeCategoriaInferior()
	{
		return atendeCategoriaInferior;
	}

	public void atendeCategoriaInferior(boolean atendeInferior)
	{
		this.atendeCategoriaInferior = atendeInferior;
	}
}
