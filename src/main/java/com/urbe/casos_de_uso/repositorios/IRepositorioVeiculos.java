package com.urbe.casos_de_uso.repositorios;

import com.urbe.entidades.Retorno;
import com.urbe.entidades.Veiculo;

public interface IRepositorioVeiculos
{
	Retorno<Veiculo> obterPorPlaca(String placa);
}
