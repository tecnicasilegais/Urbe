package com.urbe.casos_de_uso.repositorios;

import com.urbe.entidades.Motorista;

public interface IRepositorioMotoristas
{
	Motorista recuperaPorNome(String nome);

	Motorista obterPorCpf(String cpf);
}