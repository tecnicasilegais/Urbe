package com.urbe.casos_de_uso.servicos;

import com.urbe.casos_de_uso.repositorios.IRepositorioMotoristas;
import com.urbe.casos_de_uso.repositorios.IRepositorioViagens;
import com.urbe.entidades.Motorista;
import com.urbe.entidades.Passageiro;
import com.urbe.entidades.Viagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicosMotorista
{
	private IRepositorioMotoristas motoristas;
	private IRepositorioViagens viagens;

	@Autowired
	public ServicosMotorista(IRepositorioMotoristas motoristas, IRepositorioViagens viagens)
	{
		this.motoristas = motoristas;
		this.viagens = viagens;
	}

	public Motorista recuperarDadosMotorista(String cpf)
	{
		Motorista motorista = motoristas.obterPorCpf(cpf);
		if (motorista == null) {throw new IllegalArgumentException("Motorista inexistente: " + cpf);}
		return motorista;
	}

	public List<Viagem> recuperarViagensMotorista(String cpf)
	{
		return null;
	}

	public Passageiro avaliarPassageiro(String cpf, int avaliacao)
	{
		return null;
	}
}
