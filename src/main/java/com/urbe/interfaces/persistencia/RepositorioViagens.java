package com.urbe.interfaces.persistencia;

import com.urbe.casos_de_uso.repositorios.IRepositorioViagens;
import com.urbe.entidades.Motorista;
import com.urbe.entidades.Viagem;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class RepositorioViagens implements IRepositorioViagens
{
	@Override
	public void cadastrarViagem(Viagem viagem)
	{

	}

	@Override
	public Stream<Viagem> obterViagens(Motorista motorista)
	{
		return null;
	}
}
