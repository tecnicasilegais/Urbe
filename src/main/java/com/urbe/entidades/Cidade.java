package com.urbe.entidades;

import com.urbe.entidades.geometria.Reta;
import com.urbe.entidades.geometria.SituacaoReta;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cidade
{
	private String nome;
	private Map<String, Bairro> bairros;

	private Cidade(String nome)
	{
		this.nome = nome;
		this.bairros = new HashMap<String, Bairro>();
	}

	/**
	 * Cria uma instância de Cidade
	 *
	 * @param nome nome da cidade
	 * @return retorna uma instância de Cidade
	 */
	public static Cidade criaCidade(String nome)
	{
		return new Cidade(nome);
	}

	// region Getters/Setters

	/**
	 * Retorna uma String contendo o nome da cidade
	 *
	 * @return nome da cidade
	 */
	public String nome()
	{
		return nome;
	}

	/**
	 * Retorna uma instância de Bairro referente ao bairro específico da cidade
	 *
	 * @param nome nome do bairro
	 * @return Bairro cujo nome foi informado ou null caso não haja um bairro com esse nome
	 */
	public Bairro bairro(String nome)
	{
		return bairros.get(nome);
	}

	/**
	 * Registra um bairro na cidade referente
	 */
	public void regBairro(Bairro bairro)
	{
		bairros.put(bairro.nome(), bairro);
	}

	/**
	 * Lista todos nomes de bairros presentes nesta cidade
	 *
	 * @return Collection de String contendo os nomes dos bairros.
	 */
	public Collection<String> listarNomesBairros()
	{
		return bairros.keySet();
	}

	/**
	 * Lista todos Bairros percorridos pela Reta recebida
	 *
	 * @param rota rota percorrida
	 * @return List de Bairros contendo os bairros percorridos pela Reta.
	 */
	public List<Bairro> bairrosPercorridos(Reta rota)
	{
		List<Bairro> caminho =
				bairros
						.values()
						.stream()
						.filter(bairro -> bairro.limites().classifica(rota) != SituacaoReta.TODA_FORA)
						.collect(Collectors.toList());

		return caminho;
	}

	//endregion
}
