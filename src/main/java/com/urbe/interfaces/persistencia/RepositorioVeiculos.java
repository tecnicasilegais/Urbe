package com.urbe.interfaces.persistencia;

import com.urbe.casos_de_uso.repositorios.IRepositorioVeiculos;
import com.urbe.entidades.Retorno;
import com.urbe.entidades.Veiculo;
import com.urbe.entidades.VeiculosFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class RepositorioVeiculos implements IRepositorioVeiculos
{
	private Map<String, Veiculo> veiculos;

	@Autowired
	public RepositorioVeiculos(VeiculosFactory fabricaVeiculo)
	{
		veiculos = new HashMap<>();

		Veiculo veiculo = fabricaVeiculo.createInstance("ABC1234", "GM", "Verde", "NORMAL");
		veiculos.put(veiculo.placa(), veiculo);

		veiculo = fabricaVeiculo.createInstance("XYZ5678", "WW", "Cinza", "SIMPLES");
		veiculos.put(veiculo.placa(), veiculo);

		veiculo = fabricaVeiculo.createInstance("AKK7336", "Honda", "Azul", "LUXO");
		veiculos.put(veiculo.placa(), veiculo);
	}

	@Override
	public Retorno<Veiculo> obterPorPlaca(String placa)
	{
		Veiculo veiculo = veiculos.get(placa);
		if (veiculo == null)
		{
			return Retorno.retornarFalha("Cidade inexistente: " + placa);
		}
		return Retorno.retornarSucesso(veiculo);
	}
}
