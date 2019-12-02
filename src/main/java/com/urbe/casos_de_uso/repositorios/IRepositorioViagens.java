package com.urbe.casos_de_uso.repositorios;

import com.urbe.entidades.Motorista;
import com.urbe.entidades.Retorno;
import com.urbe.entidades.Viagem;

import java.util.List;

public interface IRepositorioViagens
{
	Retorno cadastrarViagem(Viagem viagem);

	Retorno<List<Viagem>> obterViagens(Motorista motorista);
}
