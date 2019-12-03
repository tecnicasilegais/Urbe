package com.urbe.casos_de_uso.politicas;

import com.urbe.entidades.Passageiro;
import com.urbe.entidades.Veiculo;
import com.urbe.entidades.Motorista;
import com.urbe.entidades.FormaPagamento;

public abstract class SelecionaVeiculo
{
    private Motorista motorista;
    private Passageiro passageiro;

    public void motorista(Motorista motorista)
    {
        this.motorista = motorista;
    }

    public void passageiro(Passageiro passageiro)
    {
        this.passageiro = passageiro;
    }

    public Motorista motorista()
    {
        return motorista;
    }

    public Passageiro passageiro()
    {
        return passageiro;
    }

    public Motorista selecionaMotorista()
    {
        
    }
}