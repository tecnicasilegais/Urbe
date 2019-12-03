package com.urbe.entidades;

public abstract class Veiculo
{
	private String placa;
	private String marca;
	private String cor;
	private String tipo;

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

	public String tipo()
	{
		return tipo;
	}

	public void tipo(String tipo)
	{
		this.tipo = tipo;
	}

	@Override
	public String toString()
	{
		return getClass().getName() + " [ Cor=" + cor + ", marca=" + marca + ", placa=" + placa + "]";
	}

	//endregion
}
