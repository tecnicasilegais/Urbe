package com.urbe.entidades;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cidade
{
	private String nome;
	private Map<String,Bairro> bairros;

	public static Cidade criaCidade(String nome)
	{
		return new Cidade(nome);
	}

	private Cidade(String nome)
	{
		this.nome = nome;
		this.bairros = new HashMap<String,Bairro>();
	}

	// region Getters/Setters
	public String getNome()
	{
		return nome;
	}

	public Bairro getBairro(String nome)
	{
		return bairros.get(nome);
	}

	public void regBairro (Bairro bairro)
	{
		
	}

	public Collection<String> listarNomesBairros()
	{
		return bairros.keySet();
	}

	//endregion
}
