package com.urbe.interfaces.persistencia;

import com.urbe.casos_de_uso.repositorios.IRepositorioCidades;
import com.urbe.entidades.Cidade;
import com.urbe.entidades.Retorno;
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
		cidades.put(c.nome(), c);
	}

	@Override
	public Retorno<Cidade> obterPorNome(String nomeCidade)
	{
		Cidade cidade = cidades.get(nomeCidade);
		if (cidade == null)
		{
			return new Retorno<>(false, "Cidade inexistente: " + nomeCidade);
		}
		return new Retorno<>(true, cidade, "Sucesso");
	}
}