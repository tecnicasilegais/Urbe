package com.urbe.casos_de_uso.politicas;

import com.urbe.entidades.Passageiro;
import com.urbe.entidades.Veiculo;
import com.urbe.entidades.Motorista;

import java.util.List;

import com.urbe.entidades.FormaPagamento;

public abstract class SelecaoMotoristaVeiculo
{
    private List<Motorista> motoristas;
    private Passageiro passageiro;
    private FormaPagamento formaPgto;

    public void motoristas(List<Motorista> motoristas)
    {
        this.motoristas = motoristas;
    }

    public void passageiro(Passageiro passageiro)
    {
        this.passageiro = passageiro;
    }

    public void formaPgto(FormaPagamento formaPgto)
    {
        this.formaPgto = formaPgto;
    }

    public List<Motorista> motoristas()
    {
        return motoristas;
    }

    public Passageiro passageiro()
    {
        return passageiro;
    }

    public FormaPagamento formaPgto()
    {
        return formaPgto;
    }

    public Motorista selecionaMotorista()
    {
        
    }
}