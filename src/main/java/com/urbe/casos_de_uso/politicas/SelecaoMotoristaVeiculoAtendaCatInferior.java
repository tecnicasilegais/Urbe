package com.urbe.casos_de_uso.politicas;

import com.urbe.entidades.Motorista;
import com.urbe.entidades.VeiculoLuxo;
import com.urbe.entidades.VeiculoNormal;

import java.util.List;
import java.util.stream.Collectors;

public class SelecaoMotoristaVeiculoAtendaCatInferior extends SelecaoMotoristaVeiculoPadrao
{

	@Override
	public List<Motorista> filtraCategoria()
	{
		switch (categoriaVeiculo())
		{
			case "SIMPLES":
				return motoristas().stream()
						.filter(mt -> mt.veiculo().tipo().equals(categoriaVeiculo())
								|| (mt.veiculo().tipo().equals("NORMAL") &&
										    ((VeiculoNormal) mt.veiculo()).atendeCategoriaInferior()))
						.collect(Collectors.toList());
			case "NORMAL":
				return motoristas().stream()
						.filter(mt -> mt.veiculo().tipo().equals(categoriaVeiculo())
								|| (mt.veiculo().tipo().equals("LUXO") &&
										    ((VeiculoLuxo) mt.veiculo()).atendeCategoriaInferior()))
						.collect(Collectors.toList());
			default:
				return super.filtraCategoria();
		}
	}

}