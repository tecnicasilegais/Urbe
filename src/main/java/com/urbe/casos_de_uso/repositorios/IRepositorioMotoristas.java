package com.urbe.casos_de_uso.repositorios;

import com.urbe.entidades.Motorista;
import com.urbe.entidades.Retorno;

import java.util.List;

public interface IRepositorioMotoristas
{
	Retorno<Motorista> obterPorNome(String nome);

	Retorno<Motorista> obterPorCpf(String cpf);

	List<Motorista> listarMotoristas();
}