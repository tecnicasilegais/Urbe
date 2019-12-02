package com.urbe.casos_de_uso.politicas;

public class CalculoCustoViagemDescontoQuantidadeViagens extends CalculoCustoViagemBasico 
{
    @Override
    public double descontoPromocaoSazonal() {
        double cb = calculoCustoBasico();
        if (passageiro().qtdAvaliacoes() >= 100)
        {
            return cb*0.15;
        }
        else if(passageiro().qtdAvaliacoes() >= 50)
        {
            return cb*0.10;
        }
        else if(passageiro().qtdAvaliacoes() >= 10)
        {
            return cb*0.05;
        }
        else
        {
            return 0.0;
        }
    }  

}