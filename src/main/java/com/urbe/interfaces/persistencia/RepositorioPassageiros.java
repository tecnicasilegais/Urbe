package com.urbe.interfaces.persistencia;

import com.urbe.casos_de_uso.repositorios.IRepositorioPassageiros;
import com.urbe.entidades.Passageiro;

public class RepositorioPassageiros implements IRepositorioPassageiros
{
	@Override
	public Passageiro recuperaPorCpf(String cpf)
	{
		return null;
	}

	@Override
	public void atualizaPassageiro(Passageiro passageiro)
	{

	}
}
