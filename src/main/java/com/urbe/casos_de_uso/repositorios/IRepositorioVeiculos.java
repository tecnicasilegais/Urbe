package com.urbe.casos_de_uso.repositorios;

import com.urbe.entidades.Veiculo;

public interface IRepositorioVeiculos
{
	Veiculo recuperaPorPlaca(String placa);
}
