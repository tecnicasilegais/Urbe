package com.urbe.interfaces.persistencia;

import com.urbe.casos_de_uso.repositorios.IRepositorioPassageiros;
import com.urbe.entidades.Passageiro;
import com.urbe.entidades.Retorno;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class RepositorioPassageiros implements IRepositorioPassageiros
{
	private Map<String, Passageiro> passageiros;

	@Override
	public Retorno<Boolean> atualizarPassageiro(Passageiro passageiro)
	{
		return new Retorno<Boolean>(true, true, "");
	}

	@Override
	public Retorno<Passageiro> obterPorCpf(String cpf)
	{
		Passageiro passageiro = passageiros.get(cpf);
		if (passageiro == null)
		{
			return new Retorno<>(false, "Passageiro inexistente: " + cpf);
		}
		return new Retorno<>(true, passageiro, "Sucesso");
	}
}
