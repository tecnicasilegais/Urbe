package com.urbe.entidades;

import com.urbe.entidades.geometria.Area;
import com.urbe.entidades.geometria.Ponto;

public class Bairro
{
	private String nome;
	private Area limites;
	private int custoBase;

	/**
	 * Método responsável por criar uma instância de bairro com formato quadrado.
	 * @param nome nome do bairro a ser criado
	 * @param p1 Ponto superior esquerdo do bairro
	 * @param tamanhoLado tamanho dos lados do bairro
	 * @param custo custo a ser adicionado em viagens que passam pelo bairro
	 * @return uma nova instância de bairro com área quadrada
	 */
	public static Bairro criaBairroQuadrado(String nome, Ponto p1, int tamanhoLado, int custo)
	{
		//TODO: criacao de bairros
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
	public static Bairro criaBairroRetangular(String nome, Ponto p1, int tamanhoLado, int tamanhoAltura, int custo)
	{
		Ponto pInferior = new Ponto(p1.getX() + tamanhoLado, p1.getY() + tamanhoAltura);
		return new Bairro(nome, new Area(p1, pInferior), custo);
	}

	private Bairro(String nome, Area limites, int custoBase)
	{
		this.nome = nome;
		this.limites = limites;
		this.custoBase = custoBase;
	}

	// region Getters/Setters
	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public Area getLimites()
	{
		return limites;
	}

	public void setLimites(Area limites)
	{
		this.limites = limites;
	}

	public int getCustoBase()
	{
		return custoBase;
	}

	public void setCustoBase(int custoBase)
	{
		this.custoBase = custoBase;
	}
	//endregion
}
