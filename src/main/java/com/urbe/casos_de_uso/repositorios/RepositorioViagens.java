package com.urbe.casos_de_uso.repositorios;

import com.urbe.entidades.Motorista;
import com.urbe.entidades.Viagem;

import java.util.stream.Stream;

public interface RepositorioViagens
{
	void cadastrarViagem(Viagem viagem);

	Stream<Viagem> obterViagens(Motorista motorista);
}
