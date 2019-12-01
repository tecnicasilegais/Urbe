package com.urbe.interfaces.persistencia;

import com.urbe.casos_de_uso.repositorios.IRepositorioCidades;
import com.urbe.entidades.Cidade;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class RepositorioCidades implements IRepositorioCidades
{
	private Map<String, Cidade> cidades;

	public RepositorioCidades()
	{

		cidades = new HashMap<>();
		Cidade c = Cidade.criaCidade("POO");
	}

	@Override
	public Cidade recuperaPorNome(String nomeCidade)
	{
		Cidade cidade = cidades.get(nomeCidade);
		if (cidade == null) {throw new IllegalArgumentException("Cidade inexistente: " + nomeCidade); }
		return cidade;
	}
}