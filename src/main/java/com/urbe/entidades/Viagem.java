package com.urbe.entidades;

import java.time.LocalTime;

public class Viagem
{
	private int id;
	private Cidade cidade;
	private LocalTime hora;
	private Bairro origem;
	private Bairro destino;
	private Motorista motorista;
	private Passageiro passageiro;
	private double custo;

	public Viagem(Cidade cidade, Bairro origem, Bairro destino, Motorista motorista, Passageiro passageiro, double custo)
	{
		this.cidade = cidade;
		this.origem = origem;
		this.destino = destino;
		this.motorista = motorista;
		this.passageiro = passageiro;
		this.custo = custo;
	}

	// region Getters/Setters
	public int id()
	{
		return id;
	}

	public void id(int id)
	{
		this.id = id;
	}

	public LocalTime hora()
	{
		return hora;
	}

	public void hora(LocalTime hora)
	{
		this.hora = hora;
	}

	public Cidade cidade() {return cidade;}

	public void cidade(Cidade cidade) {this.cidade = cidade; }

	public Bairro origem()
	{
		return origem;
	}

	public void origem(Bairro origem)
	{
		this.origem = origem;
	}

	public Bairro destino()
	{
		return destino;
	}

	public void destino(Bairro destino)
	{
		this.destino = destino;
	}

	public Motorista motorista()
	{
		return motorista;
	}

	public void motorista(Motorista motorista)
	{
		this.motorista = motorista;
	}

	public Passageiro passageiro()
	{
		return passageiro;
	}

	public void passageiro(Passageiro passageiro)
	{
		this.passageiro = passageiro;
	}

	public double custo()
	{
		return custo;
	}

	public void custo(double custo)
	{
		this.custo = custo;
	}

	//endregion
}
