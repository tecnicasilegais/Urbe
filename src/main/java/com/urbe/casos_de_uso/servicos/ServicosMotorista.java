package com.urbe.casos_de_uso.servicos;

import com.urbe.casos_de_uso.repositorios.IRepositorioMotoristas;
import com.urbe.casos_de_uso.repositorios.IRepositorioViagens;
import com.urbe.entidades.Motorista;
import com.urbe.entidades.Passageiro;
import com.urbe.entidades.Retorno;
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

	public Retorno<Motorista> obterDadosMotorista(String cpf)
	{
		return motoristas.obterPorCpf(cpf);
	}

	public Retorno<List<Viagem>> obterViagensMotorista(String cpf)
	{
		//Retorno<List<Viagem>> retornoViagens = viagens.obterViagens(motoristas.obterPorCpf(cpf));
		//if (!retornoViagens.ok())
		return null;
	}

	public Passageiro avaliarPassageiro(String cpf, int avaliacao)
	{
		return null;
	}
}
