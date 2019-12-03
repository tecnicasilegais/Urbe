package com.urbe.entidades;

public class VeiculoNormal extends Veiculo
{
	private boolean atendeCategoriaInferior;

	/**
	 * Construtor de Veiculo de categoria Normal
	 *
	 * @param placa String contendo placa do veiculo
	 * @param marca String contendo marca do veiculo
	 * @param cor   String contendo cor do veiculo
	 */
	public VeiculoNormal(String placa, String marca, String cor)
	{
		super(placa, marca, cor);
		this.atendeCategoriaInferior = true;
	}

	/**
	 * Retorna se o veículo atende categorias inferiores.
	 *
	 * @return (true) caso atenda, (false) caso não atenda categorias inferiores
	 */
	public boolean atendeCategoriaInferior()
	{
		return atendeCategoriaInferior;
	}

	/**
	 * Define se o veículo atenderá categorias inferiores.
	 *
	 * @param atendeInferior (true) para que o veículo aceite categorias inferiores (false) para que não aceite
	 */
	public void atendeCategoriaInferior(boolean atendeInferior)
	{
		this.atendeCategoriaInferior = atendeInferior;
	}
}
