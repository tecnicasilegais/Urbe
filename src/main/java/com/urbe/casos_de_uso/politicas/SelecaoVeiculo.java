package com.urbe.casos_de_uso.politicas;

import com.urbe.entidades.Passageiro;
import com.urbe.entidades.Retorno;
import com.urbe.entidades.Motorista;

import java.util.List;

import com.urbe.entidades.FormaPagamento;

public class SelecaoVeiculo 
{
    private SelecaoMotoristaVeiculo smv;

    public static SelecaoVeiculo criaSelecaoVeiculo(String tipo)
    {
        switch (tipo)
        {
            case "Padrao":
                return new SelecaoVeiculo(new SelecaoMotoristaVeiculoPadrao());
            case  "AtendaCatInferior":
                return new SelecaoVeiculo(new SelecaoMotoristaVeiculoAtendaCatInferior());
            default:
                throw new IllegalArgumentException("Categoria de seleção de veículo inválida");
        }
    }

    private SelecaoVeiculo(SelecaoMotoristaVeiculo smv)
    {
        this.smv = smv;
    }

    public Retorno<Motorista> selecMotorista(Passageiro passageiro, FormaPagamento formaPgto, List<Motorista> motoristas, String categoriaVeiculo)
    {
        smv.passageiro(passageiro);
        smv.formaPgto(formaPgto);
        smv.motoristas(motoristas);
        smv.categoriaVeiculo(categoriaVeiculo);
        return smv.selecionaMotorista();
    }
}