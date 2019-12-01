package com.urbe.interfaces.persistencia;

import com.urbe.casos_de_uso.repositorios.IRepositorioMotoristas;
import com.urbe.entidades.Motorista;
import org.springframework.stereotype.Component;

@Component
public class RepositorioMotoristas implements IRepositorioMotoristas
{

	@Override
	public Motorista obterPorNome(String nome)
	{
		return null;
	}

	@Override
	public Motorista obterPorCpf(String cpf)
	{
		return null;
	}
}
