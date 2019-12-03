package com.urbe.casos_de_uso.servicos;

import com.urbe.casos_de_uso.repositorios.IRepositorioMotoristas;
import com.urbe.casos_de_uso.repositorios.IRepositorioPassageiros;
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
	private IRepositorioPassageiros passageiros;

	@Autowired
	public ServicosMotorista(IRepositorioMotoristas motoristas, IRepositorioViagens viagens, IRepositorioPassageiros passageiros)
	{
		this.motoristas = motoristas;
		this.viagens = viagens;
		this.passageiros = passageiros;
	}

	public List<Viagem> obterViagensMotorista(String cpf)
	{
		Retorno<Motorista> retMotorista = motoristas.obterPorCpf(cpf);
		if (!retMotorista.ok())
		{
			throw new IllegalArgumentException(retMotorista.mensagem());
		}
		Retorno<List<Viagem>> retViagens = viagens.obterViagens(retMotorista.dados());
		if (!retViagens.ok())
		{
			throw new IllegalArgumentException(retViagens.mensagem());
		}
		return retViagens.dados();
	}

	public Boolean avaliarPassageiro(String cpf, int avaliacao)
	{
		Retorno<Passageiro> retPassageiro = passageiros.avaliarPassageiro(cpf, avaliacao);
		if (!retPassageiro.ok())
		{
			throw new IllegalArgumentException(retPassageiro.mensagem());
		}
		return true;
	}
}
