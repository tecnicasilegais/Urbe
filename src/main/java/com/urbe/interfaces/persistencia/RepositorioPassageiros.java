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
		passageiros.put("987654321-01", Passageiro.novoPassageiro("987654321-01", "Eduardo", FormaPagamento.CREDITO));
	}

	@Override
	public Retorno<Boolean> atualizarPassageiro(Passageiro passageiro)
	{
		Passageiro passBase = passageiros.get(passageiro.cpf());
		passBase.formaPagamento(passageiro.formaPagamento());
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
