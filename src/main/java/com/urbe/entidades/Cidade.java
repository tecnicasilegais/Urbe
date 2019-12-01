package com.urbe.entidades;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cidade
{
	private String nome;
	private Map<String,Bairro> bairros;

	/**
	 * Cria uma instância de Cidade
	 * @param nome nome da cidade
	 * @return retorna uma instância de Cidade
	 */
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
	/**
	 * Método responsável por retornar o nome da cidade
	 * @return nome da cidade
	 */
	public String nome()
	{
		return nome;
	}

	/**
	 * Método responsável por retornar um bairro específico da cidade
	 * @param nome nome do bairro
	 * @return Bairro cujo nome foi informado ou null caso não haja um bairro com esse nome
	 */
	public Bairro bairro(String nome)
	{
		return bairros.get(nome);
	}

	/**
	 * 
	 */
	public void regBairro (Bairro bairro)
	{
		bairros.put(bairro.getNome(), bairro);
	}

	public Collection<String> listarNomesBairros()
	{
		return bairros.keySet();
	}

	//endregion
}
