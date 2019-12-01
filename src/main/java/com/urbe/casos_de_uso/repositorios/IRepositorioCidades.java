package com.urbe.casos_de_uso.repositorios;

import com.urbe.entidades.Cidade;
import com.urbe.entidades.Retorno;

public interface IRepositorioCidades
{
	Retorno<Cidade> obterPorNome(String nomeCidade);
}
