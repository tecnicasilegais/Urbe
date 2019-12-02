package com.urbe.interfaces.persistencia;

import com.urbe.casos_de_uso.repositorios.IRepositorioBairros;
import com.urbe.entidades.Bairro;
import com.urbe.entidades.Retorno;
import com.urbe.entidades.geometria.Area;
import com.urbe.entidades.geometria.Ponto;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class RepositorioBairros implements IRepositorioBairros
{
	private Map<String, Bairro> bairros;

	public RepositorioBairros()
	{
		bairros = new HashMap<>();

		bairros.put("Petropolis", new Bairro("Petropolis", new Area(new Ponto(0, 12), new Ponto(4, 16)), 10));
		bairros.put("Ipiranga", new Bairro("Ipiranga", new Area(new Ponto(4, 10), new Ponto(8, 12)), 6));
		bairros.put("Solidao", new Bairro("Solidao", new Area(new Ponto(0, 8), new Ponto(2, 12)), 5));
		bairros.put("Bom Fim", new Bairro("Bom Fim", new Area(new Ponto(2, 8), new Ponto(8, 12)), 10));
		bairros.put("Vila Nova", new Bairro("Vila Nova", new Area(new Ponto(8, 10), new Ponto(13, 16)), 15));
		bairros.put("Alegria", new Bairro("Alegria", new Area(new Ponto(0, 4), new Ponto(5, 8)), 10));
		bairros.put("Boa Vista", new Bairro("Boa Vista", new Area(new Ponto(5, 4), new Ponto(10, 8)), 15));
		bairros.put("Gavea", new Bairro("Gavea", new Area(new Ponto(10, 4), new Ponto(12, 7)), 20));
	}

	@Override
	public Retorno<Bairro> obterPorNome(String nomeBairro)
	{
		Bairro bairro = bairros.get(nomeBairro);
		if (bairro == null)
		{
			return Retorno.retornarFalha("Bairro inexistente: " + nomeBairro);
		}
		return Retorno.retornarSucesso(bairro);
	}
}
