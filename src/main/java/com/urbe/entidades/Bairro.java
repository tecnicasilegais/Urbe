package com.urbe.entidades;

import com.urbe.entidades.geometria.Area;
import com.urbe.entidades.geometria.Ponto;

public class Bairro
{
	private String nome;
	private Area limites;
	private int custoBase;

	public static Bairro criaBairroQuadrado(String nome, Ponto p1, int tamanhoLado, int custo)
	{
		//TODO: criacao de bairros
		Area a = new Area(p1, new Ponto(p1.getX() + tamanhoLado, p1.getY() - tamanhoLado));
		return new Bairro(nome, a, custo);
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
