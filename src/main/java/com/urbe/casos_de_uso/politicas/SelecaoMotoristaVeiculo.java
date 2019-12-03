package com.urbe.casos_de_uso.politicas;

import com.urbe.entidades.Passageiro;
import com.urbe.entidades.Retorno;
import com.urbe.entidades.Motorista;

import java.util.List;
import java.util.Random;

import com.urbe.entidades.FormaPagamento;

public abstract class SelecaoMotoristaVeiculo
{
    private List<Motorista> motoristas;
    private Passageiro passageiro;
    private FormaPagamento formaPgto;
    private String categoriaVeiculo;

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

    public void categoriaVeiculo(String categoriaVeiculo)
    {
        this.categoriaVeiculo = categoriaVeiculo;
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

    public String categoriaVeiculo()
    {
        return categoriaVeiculo;
    }

    public Retorno<Motorista> selecionaMotorista()
    {
        motoristas = filtraFormaPgto();
        if(motoristas.isEmpty())
            return Retorno.retornarFalha("Não foi possível localizar um motorista para esta forma de pagamento");
        
        motoristas = filtraCategoria();
        if(motoristas.isEmpty())
            return Retorno.retornarFalha("Não foi possível localizar um motorista para esta categoria");
        
        motoristas = filtraPontuacao();
        if(motoristas.isEmpty())
            return Retorno.retornarFalha("Não foi encontrado um motorista compatível com sua pontuação");

        Random rd = new Random();
        
        Motorista rdm = motoristas.get(rd.nextInt(motoristas.size()));
        return Retorno.retornarSucesso(rdm);

    }

    public abstract List<Motorista> filtraFormaPgto();

    public abstract List<Motorista> filtraCategoria();

    public abstract List<Motorista> filtraPontuacao();

}