package com.urbe.casos_de_uso.politicas;

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
        switch(veiculo().getClass().getName())
        {
            case "VeiculoSimples":
                return 0.0;
            case "VeiculoNormal":
                return calculoCustoBasico()*0.1;
            case "VeiculoLuxo":
                int bairrosPercorr = cidade().bairrosPercorridos(rota()).size();
                double percentual = bairrosPercorr * 0.02;
                double custoBasico = calculoCustoBasico();
                return custoBasico*0.1 + custoBasico*percentual;
            default: return 0;
        }
    }
    
    @Override
    public double adicionalDinamica() {
        return 0.0;
    }

    @Override
    public double descontoPontuacao() {
        return 0.0;
    }

    @Override
    public double descontoPromocaoSazonal() {
        return 0.0;
    }
}