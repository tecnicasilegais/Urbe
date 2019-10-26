package com.urbe.entidades.to;

import com.urbe.entidades.geometria.Area;

public class Bairro
{
	private String nome;
	private Area limites;
	private int custoBase;

	public Bairro(String nome, Area limites, int custoBase)
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
