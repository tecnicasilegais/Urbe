package com.urbe.interfaces.persistencia;

import com.urbe.casos_de_uso.repositorios.IRepositorioPassageiros;
import com.urbe.entidades.Passageiro;
import com.urbe.entidades.Retorno;
import org.springframework.stereotype.Component;

@Component
public class RepositorioPassageiros implements IRepositorioPassageiros
{
	@Override
	public Retorno<Passageiro> obterPorCpf(String cpf)
	{
		return null;
	}

	@Override
	public Retorno<Boolean> atualizarPassageiro(Passageiro passageiro)
	{
		return new Retorno<Boolean>(true, true, "");
	}
}
