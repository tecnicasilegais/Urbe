package com.urbe.entidades;

import com.urbe.entidades.geometria.Area;
import com.urbe.entidades.geometria.Ponto;

public class Bairro
{
	private String nome;
	private Area limites;
	private double custoBase;

	public Bairro(String nome, Area limites, double custoBase)
	{
		this.nome = nome;
		this.limites = limites;
		this.custoBase = custoBase;
	}

	// region Getters/Setters

	/**
	 * Método responsável por informar o nome do Bairro.
	 * @return String contendo o nome
	 */
	public String getNome()
	{
		return nome;
	}

	/**
	 * Retorna a área do Bairro.
	 * @return variavel contendo a área do bairro
	 */
	public Area getLimites()
	{
		return limites;
	}

	/**
	 * Retorna o custo base deste bairro.
	 * @return int contendo o valor do custo
	 */
	public double getCustoBase()
	{
		return custoBase;
	}

	/**
	 * Altera o custo base do bairro
	 * @param custoBase novo custo
	 */
	public void setCustoBase(double custoBase)
	{
		if (custoBase < 0){
			throw new IllegalArgumentException("Valor inválido");
		}
		this.custoBase = custoBase;
	}
	//endregion

	@Override
	public String toString() {
		return "Bairro [area=" + limites + ", nome=" + nome + "]";
	}
}
