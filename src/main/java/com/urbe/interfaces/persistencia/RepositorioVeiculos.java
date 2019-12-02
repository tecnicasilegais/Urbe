package com.urbe.interfaces.persistencia;

import com.urbe.casos_de_uso.repositorios.IRepositorioVeiculos;
import com.urbe.entidades.Retorno;
import com.urbe.entidades.Veiculo;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class RepositorioVeiculos implements IRepositorioVeiculos
{
	private Map<String, Veiculo> veiculos;

	@Override
	public Retorno<Veiculo> obterPorPlaca(String placa)
	{
		Veiculo veiculo = veiculos.get(placa);
		if (veiculo == null)
		{
			return new Retorno<>(false, "Cidade inexistente: " + placa);
		}
		return new Retorno<>(true, veiculo, "Sucesso");
	}
}
