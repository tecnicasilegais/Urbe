package com.urbe.entidades.to;

import java.util.List;

public class Cidade
{
	private String nome;
	private List bairro;

	public Cidade(String nome, List bairro)
	{
		this.nome = nome;
		this.bairro = bairro;
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

	public List getBairro()
	{
		return bairro;
	}

	public void setBairro(List bairro)
	{
		this.bairro = bairro;
	}

	//endregion
}
