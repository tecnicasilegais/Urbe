package com.urbe.interfaces.persistencia;

import com.urbe.casos_de_uso.repositorios.IRepositorioVeiculos;
import com.urbe.entidades.Retorno;
import com.urbe.entidades.Veiculo;
import org.springframework.stereotype.Component;

@Component
public class RepositorioVeiculos implements IRepositorioVeiculos
{
	@Override
	public Retorno<Veiculo> obterPorPlaca(String placa)
	{
		return null;
	}
}
