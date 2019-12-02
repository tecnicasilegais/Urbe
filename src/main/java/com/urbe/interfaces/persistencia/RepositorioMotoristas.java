package com.urbe.interfaces.persistencia;

import com.urbe.casos_de_uso.repositorios.IRepositorioMotoristas;
import com.urbe.entidades.Motorista;
import com.urbe.entidades.Retorno;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class RepositorioMotoristas implements IRepositorioMotoristas
{
	private Map<String, Motorista> motoristas;

	@Override
	public Retorno<Motorista> obterPorNome(String nome)
	{
		return null;
	}

	@Override
	public Retorno<Motorista> obterPorCpf(String cpf)
	{
		Motorista motorista = motoristas.get(cpf);
		if (motorista == null)
		{
			return new Retorno<>(false, "Motorista inexistente: " + cpf);
		}
		return new Retorno<>(true, motorista, "Sucesso");
	}
}
