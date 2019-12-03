package com.urbe.casos_de_uso.repositorios;

import java.util.List;

import com.urbe.entidades.Motorista;
import com.urbe.entidades.Retorno;

public interface IRepositorioMotoristas
{
	Retorno<Motorista> obterPorNome(String nome);

	Retorno<Motorista> obterPorCpf(String cpf);

	List<Motorista> listarMotoristas();
}