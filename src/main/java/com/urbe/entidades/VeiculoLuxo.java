package com.urbe.entidades;

public class VeiculoLuxo extends VeiculoNormal
{
	private boolean bagageiroGrande;

	public VeiculoLuxo(String placa, String marca, String cor)
	{
		super(placa, marca, cor);
		this.bagageiroGrande = true;
	}

	public boolean temBagageiroGrande()
	{
		return bagageiroGrande;
	}

	public void setBagageiroGrande(boolean bagageiroGrande)
	{
		this.bagageiroGrande = bagageiroGrande;
	}
}
