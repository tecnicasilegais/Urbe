package com.urbe.entidades;

public class VeiculoLuxo extends VeiculoNormal
{
	private boolean bagageiroGrande;

	/**
	 * Construtor para Veiculo de categoria Luxo
	 *
	 * @param placa String contendo a placa do veículo
	 * @param marca String contendo a marca do veículo
	 * @param cor   String contendo a cor do veículo
	 */
	public VeiculoLuxo(String placa, String marca, String cor)
	{
		super(placa, marca, cor);
		this.bagageiroGrande = true;
		tipo("LUXO");
	}

	/**
	 * Retorna se o veículo tem bagageiro grande
	 *
	 * @return (true) para caso tenha (false) caso não tenha bagageiro grande
	 */
	public boolean temBagageiroGrande()
	{
		return bagageiroGrande;
	}

	/**
	 * Define se o veiculo terá bagageiro grande
	 *
	 * @param bagageiroGrande (true) caso deseje que tenha (false) caso não
	 */
	public void bagageiroGrande(boolean bagageiroGrande)
	{
		this.bagageiroGrande = bagageiroGrande;
	}
}
