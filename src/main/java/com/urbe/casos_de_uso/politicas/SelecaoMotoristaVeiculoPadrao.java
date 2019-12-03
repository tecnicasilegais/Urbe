package com.urbe.casos_de_uso.politicas;

import com.urbe.entidades.Motorista;

import java.util.List;
import java.util.stream.Collectors;

public class SelecaoMotoristaVeiculoPadrao extends SelecaoMotoristaVeiculo
{

	@Override
	public List<Motorista> filtraFormaPgto()
	{
		return motoristas().stream()
				.filter(mt -> mt.formasPagamento().contains(formaPgto()))
				.collect(Collectors.toList());
	}

	@Override
	public List<Motorista> filtraCategoria()
	{
		return motoristas().stream()
				.filter(mt -> mt.veiculo().tipo().equals(categoriaVeiculo()))
				.collect(Collectors.toList());
	}

	@Override
	public List<Motorista> filtraPontuacao()
	{
		return motoristas().stream()
				.filter(mt -> Math.abs(mt.pontuacaoMedia() - passageiro().pontuacaoMedia()) <= 4.0)
				.collect(Collectors.toList());
	}

}