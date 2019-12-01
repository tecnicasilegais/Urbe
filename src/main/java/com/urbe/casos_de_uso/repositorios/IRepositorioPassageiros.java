package com.urbe.casos_de_uso.repositorios;

import com.urbe.entidades.Passageiro;

public interface IRepositorioPassageiros
{
	Passageiro obterPorCpf(String cpf);

	void atualizaPassageiro(Passageiro passageiro);
}