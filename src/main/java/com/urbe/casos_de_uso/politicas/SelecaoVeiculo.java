package com.urbe.casos_de_uso.politicas;

import com.urbe.entidades.Passageiro;
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
            case "FormaPgto":
                return new SelecaoVeiculo(new SelecaoMotoristaVeiculoFormaPgto());
            
            default:
                throw new IllegalArgumentException("Categoria de seleção de veículo inválida");
        }
    }

    private SelecaoVeiculo(SelecaoMotoristaVeiculo smv)
    {
        this.smv = smv;
    }

    public Motorista selecMotorista(Passageiro passageiro, FormaPagamento formaPgto, List<Motorista> motoristas)
    {
        smv.passageiro(passageiro);
        smv.formaPgto(formaPgto);
        smv.motoristas(motoristas);
        return smv.selecionaMotorista();
    }
}