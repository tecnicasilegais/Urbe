package com.urbe.interfaces.persistencia;

import com.urbe.casos_de_uso.repositorios.IRepositorioBairros;
import com.urbe.entidades.Bairro;
import com.urbe.entidades.Retorno;
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
		//FIXME Base access
	}

	@Override
	public Retorno<Bairro> obterPorNome(String nomeBairro)
	{
		Bairro bairro = bairros.get(nomeBairro);
		if (bairro == null)
		{
			return new Retorno<>(false, "Bairro inexistente: " + nomeBairro);
		}
		return new Retorno<>(true, bairro, "Sucesso");
	}
}
