package com.urbe.interfaces.persistencia;

import com.urbe.casos_de_uso.repositorios.IRepositorioMotoristas;
import com.urbe.entidades.Motorista;
import com.urbe.entidades.Retorno;
import org.springframework.stereotype.Component;

@Component
public class RepositorioMotoristas implements IRepositorioMotoristas
{

	@Override
	public Retorno<Motorista> obterPorNome(String nome)
	{
		return null;
	}

	@Override
	public Retorno<Motorista> obterPorCpf(String cpf)
	{
		return null;
	}
}
