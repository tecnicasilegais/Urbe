package com.urbe.entidades;

import java.time.LocalTime;

public class Viagem
{
	private int id;
	private LocalTime hora;
	private Bairro origem;
	private Bairro destino;
	private Motorista motorista;
	private Passageiro passageiro;
	private double custo;

	public Viagem(Bairro origem, Bairro destino, Motorista motorista, Passageiro passageiro, double custo)
	{
		this.origem = origem;
		this.destino = destino;
		this.motorista = motorista;
		this.passageiro = passageiro;
		this.custo = custo;
	}

	// region Getters/Setters
	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public LocalTime getHora()
	{
		return hora;
	}

	public void setHora(LocalTime hora)
	{
		this.hora = hora;
	}

	public Bairro getOrigem()
	{
		return origem;
	}

	public void setOrigem(Bairro origem)
	{
		this.origem = origem;
	}

	public Bairro getDestino()
	{
		return destino;
	}

	public void setDestino(Bairro destino)
	{
		this.destino = destino;
	}

	public Motorista getMotorista()
	{
		return motorista;
	}

	public void setMotorista(Motorista motorista)
	{
		this.motorista = motorista;
	}

	public Passageiro getPassageiro()
	{
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro)
	{
		this.passageiro = passageiro;
	}

	public double getCusto()
	{
		return custo;
	}

	public void setCusto(double custo)
	{
		this.custo = custo;
	}

	//endregion
}
