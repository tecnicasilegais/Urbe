package com.urbe.interfaces.persistencia;

import com.urbe.casos_de_uso.repositorios.IRepositorioPassageiros;
import com.urbe.entidades.FormaPagamento;
import com.urbe.entidades.Passageiro;
import com.urbe.entidades.Retorno;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class RepositorioPassageiros implements IRepositorioPassageiros
{
	private Map<String, Passageiro> passageiros;

	public RepositorioPassageiros()
	{
		passageiros = new HashMap<>();

		passageiros.put("123456789-01", Passageiro.novoPassageiro("123456789-01", "Marcelo", FormaPagamento.CREDITO));
		passageiros.put("987654321-01", Passageiro.novoPassageiroExistente("987654321-01", "Eduardo", FormaPagamento.CREDITO, 10, 5));
	}

	@Override
	public Retorno<Passageiro> avaliarPassageiro(String cpf, int avaliacao)
	{
		Passageiro passageiro = passageiros.get(cpf);
		if (passageiro == null)
		{
			return Retorno.retornarFalha("Passageiro inexistente: " + cpf);
		}
		passageiro.avalia(avaliacao);
		return Retorno.retornarSucesso(passageiro);
	}

	@Override
	public Retorno<Passageiro> obterPorCpf(String cpf)
	{
		Passageiro passageiro = passageiros.get(cpf);
		if (passageiro == null)
		{
			return Retorno.retornarFalha("Passageiro inexistente: " + cpf);
		}
		return Retorno.retornarSucesso(passageiro);
	}
}
