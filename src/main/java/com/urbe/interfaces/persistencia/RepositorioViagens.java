package com.urbe.interfaces.persistencia;

import com.urbe.casos_de_uso.repositorios.IRepositorioViagens;
import com.urbe.entidades.Motorista;
import com.urbe.entidades.Retorno;
import com.urbe.entidades.Viagem;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RepositorioViagens implements IRepositorioViagens
{
	@Override
	public Retorno cadastrarViagem(Viagem viagem)
	{
		return null;
	}

	@Override
	public Retorno<List<Viagem>> obterViagens(Retorno<Motorista> motorista)
	{
		return null;
	}
}
