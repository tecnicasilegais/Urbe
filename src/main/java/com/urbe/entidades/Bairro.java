package com.urbe.entidades;

import com.urbe.entidades.geometria.Area;
import com.urbe.entidades.geometria.Ponto;

public class Bairro
{
	private String nome;
	private Area limites;
	private double custoBase;

	/**
	 * Método responsável por criar uma instância de bairro com formato quadrado.
	 * @param nome nome do bairro a ser criado
	 * @param p1 Ponto superior esquerdo do bairro
	 * @param tamanhoLado tamanho dos lados do bairro
	 * @param custo custo a ser adicionado em viagens que passam pelo bairro
	 * @return uma nova instância de bairro com área quadrada
	 */
	public static Bairro criaBairroQuadrado(String nome, Ponto p1, int tamanhoLado, double custo)
	{
		Area a = new Area(p1, new Ponto(p1.getX() + tamanhoLado, p1.getY() - tamanhoLado));
		return new Bairro(nome, a, custo);
	}

	/**
	 * Método responsável por criar uma instância de bairro retangular comum.
	 * @param nome nome do bairro a ser criado
	 * @param p1 Ponto superior esquerdo do bairro
	 * @param tamanhoAltura  tamanho vertical do bairro
	 * @param tamanhoLado tamanho horizontal do bairro
	 * @param custo custo a ser adicionado em viagens que passam pelo bairro
	 * @return uma nova instância de bairro com área retangular
	 */
	public static Bairro criaBairroRetangular(String nome, Ponto p1, int tamanhoLado, int tamanhoAltura, double custo)
	{
		Ponto pInferior = new Ponto(p1.getX() + tamanhoLado, p1.getY() + tamanhoAltura);
		return new Bairro(nome, new Area(p1, pInferior), custo);
	}

	private Bairro(String nome, Area limites, double custoBase)
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
