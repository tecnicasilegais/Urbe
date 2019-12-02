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

	public RepositorioCidades(RepositorioBairros bairros)
	{
		cidades = new HashMap<>();
		Cidade c = Cidade.criaCidade("POO");

		c.regBairro(bairros.obterPorNome("Petropolis").dados());
		c.regBairro(bairros.obterPorNome("Ipiranga").dados());
		c.regBairro(bairros.obterPorNome("Solidao").dados());
		c.regBairro(bairros.obterPorNome("Bom Fim").dados());
		c.regBairro(bairros.obterPorNome("Vila Nova").dados());
		c.regBairro(bairros.obterPorNome("Alegria").dados());
		c.regBairro(bairros.obterPorNome("Boa Vista").dados());
		c.regBairro(bairros.obterPorNome("Gavea").dados());

		cidades.put(c.nome(), c);
	}

	@Override
	public Retorno<Cidade> obterPorNome(String nomeCidade)
	{
		Cidade cidade = cidades.get(nomeCidade);
		if (cidade == null)
		{
			return Retorno.retornarFalha("Cidade inexistente: " + nomeCidade);
		}
		return Retorno.retornarSucesso(cidade);
	}
}