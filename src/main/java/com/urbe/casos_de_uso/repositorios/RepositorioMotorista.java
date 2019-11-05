package com.urbe.casos_de_uso.repositorios;

import com.urbe.casos_de_uso.politicas.RnMotorista;

public interface RepositorioMotorista
{
	RnMotorista obter(String cpf);

	boolean alterar(RnMotorista motorista);
}
