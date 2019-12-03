package com.urbe.entidades;

public class VeiculoSimples extends Veiculo
{
	/**
	 * Construtor para Veiculos de categoria Simples
	 *
	 * @param placa String contendo placa do veiculo
	 * @param marca String contendo marca do veiculo
	 * @param cor   String contendo cor do veiculo
	 */
	public VeiculoSimples(String placa, String marca, String cor)
	{
		super(placa, marca, cor);
		tipo("SIMPLES");
	}
}
