package com.urbe.casos_de_uso.repositorios;

import com.urbe.entidades.Passageiro;
import com.urbe.entidades.Retorno;

public interface IRepositorioPassageiros
{
	Retorno<Passageiro> obterPorCpf(String cpf);

	Retorno<Boolean> atualizarPassageiro(Passageiro passageiro);
}