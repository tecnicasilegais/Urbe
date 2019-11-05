package com.urbe.entidades;

public class Veiculo
{
	private String placa;
	private String marca;
	private String cor;
	private boolean atendeCategoriaInferior;
	private boolean bagageiroGrande;

	public Veiculo(String placa, String marca, String cor, boolean atendeCategoriaInferior, boolean bagageiroGrande)
	{
		this.placa = placa;
		this.marca = marca;
		this.cor = cor;
		this.atendeCategoriaInferior = atendeCategoriaInferior;
		this.bagageiroGrande = bagageiroGrande;
	}

	// region Getters/Setters
	public String getPlaca()
	{
		return placa;
	}

	public void setPlaca(String placa)
	{
		this.placa = placa;
	}

	public String getMarca()
	{
		return marca;
	}

	public void setMarca(String marca)
	{
		this.marca = marca;
	}

	public String getCor()
	{
		return cor;
	}

	public void setCor(String cor)
	{
		this.cor = cor;
	}

	public boolean isAtendeCategoriaInferior()
	{
		return atendeCategoriaInferior;
	}

	public void setAtendeCategoriaInferior(boolean atendeCategoriaInferior)
	{
		this.atendeCategoriaInferior = atendeCategoriaInferior;
	}

	public boolean isBagageiroGrande()
	{
		return bagageiroGrande;
	}

	public void setBagageiroGrande(boolean bagageiroGrande)
	{
		this.bagageiroGrande = bagageiroGrande;
	}
	//endregion
}
