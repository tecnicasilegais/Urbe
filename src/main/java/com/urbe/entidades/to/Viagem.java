package com.urbe.entidades.to;

import java.time.LocalTime;

public class Viagem
{
	private int id;
	private LocalTime hora;
	private Roteiro roteiro;
	private Motorista motorista;
	private Passageiro passageiro;
	private double custo;

	public Viagem(int id, LocalTime hora, Roteiro roteiro, Motorista motorista, Passageiro passageiro, double custo)
	{
		this.id = id;
		this.hora = hora;
		this.roteiro = roteiro;
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

	public Roteiro getRoteiro()
	{
		return roteiro;
	}

	public void setRoteiro(Roteiro roteiro)
	{
		this.roteiro = roteiro;
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
