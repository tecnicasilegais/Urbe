package com.urbe.interfaces.persistencia;

import com.urbe.casos_de_uso.repositorios.IRepositorioBairros;
import com.urbe.entidades.Bairro;
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

		//FIXME implementar acesso à base Access
		bairros.put("Petropolis", Bairro.novoBairroQuadrado("Petropolis", new Ponto(0, 12), 4, 10));
		bairros.put("Ipiranga", Bairro.novoBairroRetangular("Ipiranga", new Ponto(4, 10), 4, 2, 6));
		bairros.put("Solidao", Bairro.novoBairroRetangular("Solidao", new Ponto(0, 8), 2, 4, 5));
		bairros.put("Bom Fim", Bairro.novoBairroRetangular("Bom Fim", new Ponto(2, 8), 6, 4, 10));
		bairros.put("Vila Nova", Bairro.novoBairroRetangular("Vila Nova", new Ponto(8, 10), 5, 6, 15));
		bairros.put("Alegria", Bairro.novoBairroRetangular("Alegria", new Ponto(0, 4), 5, 4, 10));
		bairros.put("Boa Vista", Bairro.novoBairroRetangular("Boa Vista", new Ponto(5, 4), 5, 4, 15));
		bairros.put("Gavea", Bairro.novoBairroRetangular("Gavea", new Ponto(10, 4), 2, 3, 20));
	}

	@Override
	public Bairro recuperaPorNome(String nomeBairro)
	{
		Bairro bairro = bairros.get(nomeBairro);
		if (bairro == null) { throw new IllegalArgumentException("Bairro inexistente: " + nomeBairro); }
		return bairro;
	}
}
