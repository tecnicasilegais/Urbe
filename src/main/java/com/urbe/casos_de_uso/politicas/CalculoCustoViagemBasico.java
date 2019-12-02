package com.urbe.casos_de_uso.politicas;

import com.urbe.entidades.geometria.Reta;

public class CalculoCustoViagemBasico extends CalculoCustoViagem 
{
    
    @Override
    public double calculoCustoBasico()
    {
        return cidade().bairrosPercorridos(rota())
                .stream()
                .mapToDouble(bairr -> bairr.custoBase())
                .sum();
    }

    @Override
    public double adicionalVeiculo() 
    {

    }
}