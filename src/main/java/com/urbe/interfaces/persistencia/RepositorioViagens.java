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
@SuppressWarnings("rawtypes")
@Component
public class RepositorioViagens implements IRepositorioViagens
{
	private Map<String, List<Viagem>> viagens;

	public RepositorioViagens()
	{
		viagens = new HashMap<>();
	}

	@Override
	public Retorno cadastrarViagem(Viagem viagem)
	{
		if (viagens.containsKey(viagem.motorista().cpf()))
		{
			viagens.get(viagem.motorista().cpf())
					.add(viagem);
			return new Retorno(true, "Sucesso");
		}
		LinkedList<Viagem> listaInicial = new LinkedList<>();
		listaInicial.add(viagem);
		viagens.put(viagem.motorista().cpf(), listaInicial);
		return new Retorno(true, "Sucesso");
	}

	@Override
	public Retorno<List<Viagem>> obterViagens(Motorista motorista)
	{
		List<Viagem> viagensMotorista = viagens.get(motorista);
		if (viagensMotorista == null)
		{
			return new Retorno<>(false, "Motorista " + motorista.nome() + "não tem viagens: ");
		}
		return new Retorno<>(true, viagensMotorista, "Sucesso");
	}
}
