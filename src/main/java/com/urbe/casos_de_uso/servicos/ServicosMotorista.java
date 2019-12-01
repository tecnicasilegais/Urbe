package com.urbe.casos_de_uso.servicos;

import com.urbe.casos_de_uso.repositorios.IRepositorioMotoristas;
import com.urbe.casos_de_uso.repositorios.IRepositorioViagens;
import com.urbe.entidades.Motorista;

public class ServicosMotorista
{
	IRepositorioMotoristas motoristas;
	IRepositorioViagens viagens;

	public ServicosMotorista(IRepositorioMotoristas motoristas, IRepositorioViagens viagens)
	{
		this.motoristas = motoristas;
		this.viagens = viagens;
	}

	public Motorista recuperarDadosMotorista(String cpf)
	{
		Motorista motorista = motoristas.obterPorCpf(cpf);
		if (motorista == null) {throw new IllegalArgumentException("Motorista inexistente: " +);}
		return motorista;
	}
}
