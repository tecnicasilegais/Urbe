package com.urbe.casos_de_uso.repositorios;

import com.urbe.entidades.Passageiro;

public interface IRepositorioPassageiros
{
	Passageiro recuperaPorCpf(String cpf);

	void atualizaPassageiro(Passageiro passageiro);
}