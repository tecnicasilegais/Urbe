package com.urbe.casos_de_uso.repositorios;

import com.urbe.entidades.Motorista;

public interface IRepositorioMotorista
{
	Motorista recuperaPorNome(String nome);
}