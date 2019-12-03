package com.urbe.interfaces.persistencia;

import com.urbe.casos_de_uso.repositorios.IRepositorioViagens;
import com.urbe.entidades.Motorista;
import com.urbe.entidades.Retorno;
import com.urbe.entidades.Viagem;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Component
public class RepositorioViagens implements IRepositorioViagens
{
	private Map<String, List<Viagem>> viagens;

	public RepositorioViagens()
	{
		viagens = new HashMap<>();

		viagens.put("", new LinkedList<>());
	}

	@Override
	public Retorno<Boolean> cadastrarViagem(Viagem viagem)
	{
		if (viagens.containsKey(viagem.motorista().cpf()))
		{
			viagens.get(viagem.motorista().cpf())
					.add(viagem);
			return Retorno.retornarSucesso(true);
		}
		LinkedList<Viagem> listaInicial = new LinkedList<>();
		listaInicial.add(viagem);
		viagens.put(viagem.motorista().cpf(), listaInicial);
		return Retorno.retornarSucesso(true);
	}

	@Override
	public Retorno<List<Viagem>> obterViagens(Motorista motorista)
	{
		List<Viagem> viagensMotorista = viagens.get(motorista);
		if (viagensMotorista == null)
		{
			return Retorno.retornarFalha("Motorista " + motorista.nome() + "não tem viagens: ");
		}
		return Retorno.retornarSucesso(viagensMotorista);
	}
}
