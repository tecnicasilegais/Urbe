package com.urbe.casos_de_uso.politicas;

import java.util.List;
import java.util.stream.Collectors;
import com.urbe.entidades.VeiculoNormal;
import com.urbe.entidades.VeiculoLuxo;

import com.urbe.entidades.Motorista;

public class SelecaoMotoristaVeiculoAtendaCatInferior extends SelecaoMotoristaVeiculoPadrao {

    @Override
    public List<Motorista> filtraCategoria() 
    {
        switch(categoriaVeiculo())
        {
            case "SIMPLES":
                return motoristas().stream()
                                    .filter(mt -> mt.veiculo().getClass().getName().equals(categoriaVeiculo())
                                            || (mt.veiculo().getClass().getName().equals("NORMAL") &&
                                                ((VeiculoNormal)mt.veiculo()).atendeCategoriaInferior()))
                                    .collect(Collectors.toList());
            case "NORMAL":
                return motoristas().stream()
                                .filter(mt -> mt.veiculo().getClass().getName().equals(categoriaVeiculo())
                                        || (mt.veiculo().getClass().getName().equals("LUXO") &&
                                            ((VeiculoLuxo)mt.veiculo()).atendeCategoriaInferior()))
                                .collect(Collectors.toList());
            default: return super.filtraCategoria();
        }
    }


}