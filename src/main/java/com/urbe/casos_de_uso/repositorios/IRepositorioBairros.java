package com.urbe.casos_de_uso.repositorios;

import com.urbe.entidades.Bairro;
import com.urbe.entidades.Retorno;

public interface IRepositorioBairros
{
	Retorno<Bairro> obterPorNome(String nomeBairro);
}
