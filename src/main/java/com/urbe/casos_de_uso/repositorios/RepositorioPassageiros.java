package com.urbe.casos_de_uso.repositorios;

import com.urbe.entidades.Passageiro;

public interface RepositorioPassageiros
{
	Passageiro obter(String cpf);
	boolean alterar(Passageiro passageiro);
}
