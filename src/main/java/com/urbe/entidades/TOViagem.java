package com.urbe.entidades;

public class TOViagem
{
	private double custoCorrida;
	private String marcaModelo;
	private String nomeMotorista;
	private String placaVeiculo;

	public double custoCorrida()
	{
		return custoCorrida;
	}

	public void custoCorrida(double custoCorrida)
	{
		this.custoCorrida = custoCorrida;
	}

	public String marcaModelo()
	{
		return marcaModelo;
	}

	public void marcaModelo(String marcaModelo)
	{
		this.marcaModelo = marcaModelo;
	}

	public String nomeMotorista()
	{
		return nomeMotorista;
	}

	public void nomeMotorista(String nomeMotorista)
	{
		this.nomeMotorista = nomeMotorista;
	}

	public String placaVeiculo()
	{
		return placaVeiculo;
	}

	public void placaVeiculo(String placaVeiculo)
	{
		this.placaVeiculo = placaVeiculo;
	}
}
