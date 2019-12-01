package com.urbe.entidades;

public abstract class Veiculo
{
	private String placa;
	private String marca;
	private String cor;

	public Veiculo(String placa, String marca, String cor)
	{
		this.placa = placa;
		this.marca = marca;
		this.cor = cor;
	}

	// region Getters/Setters
	public String placa()
	{
		return placa;
	}

	public String marca()
	{
		return marca;
	}

	public String cor()
	{
		return cor;
	}

	@Override
	public String toString()
	{
		return getClass().getName() + " [ Cor=" + cor + ", marca=" + marca + ", placa=" + placa + "]";
	}

	//endregion
}
