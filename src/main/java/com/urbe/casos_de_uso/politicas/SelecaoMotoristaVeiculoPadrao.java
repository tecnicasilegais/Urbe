package com.urbe.casos_de_uso.politicas;

import java.util.List;
import java.util.stream.Collectors;

import com.urbe.entidades.Motorista;

public class SelecaoMotoristaVeiculoPadrao extends SelecaoMotoristaVeiculo {

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
                           .filter(mt -> mt.veiculo().getClass().getName().equals(categoriaVeiculo()))
                           .collect(Collectors.toList());
    }

    @Override
    public List<Motorista> filtraPontuacao() 
    {
        return motoristas().stream()
                           .filter(mt -> Math.abs(mt.pontuacaoMedia() - passageiro().pontuacaoMedia())<=4.0)
                           .collect(Collectors.toList());
    }

}