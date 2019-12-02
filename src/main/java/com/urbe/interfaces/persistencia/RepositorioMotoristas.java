package com.urbe.interfaces.persistencia;

import com.urbe.casos_de_uso.repositorios.IRepositorioMotoristas;
import com.urbe.entidades.FormaPagamento;
import com.urbe.entidades.Motorista;
import com.urbe.entidades.Retorno;
import com.urbe.entidades.Veiculo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
public class RepositorioMotoristas implements IRepositorioMotoristas
{
	private Map<String, Motorista> motoristas;

	public RepositorioMotoristas(RepositorioVeiculos repV)
	{
		motoristas = new HashMap<>();
		Motorista motorista;
		Veiculo veiculo;
		ArrayList<FormaPagamento> formasPgto = new ArrayList<>(1);
		formasPgto.set(0, FormaPagamento.CREDITO);

		veiculo = repV.obterPorPlaca("ABC1234").dados();
		motorista = Motorista.novoMotorista("349983409-88", "Jose Luis", veiculo, formasPgto);
		motoristas.put(motorista.cpf(), motorista);

		veiculo = repV.obterPorPlaca("XYZ5678").dados();
		motorista = Motorista.novoMotorista("786234902-33", "Aline Monteiro", veiculo, formasPgto);
		motoristas.put(motorista.cpf(), motorista);

		veiculo = repV.obterPorPlaca("AKK7336").dados();
		motorista = Motorista.novoMotorista("098276140-99", "Luciane Swork", veiculo, formasPgto);
		motoristas.put(motorista.cpf(), motorista);
	}

	@Override
	public Retorno<Motorista> obterPorNome(String nome)
	{
		for (Motorista motorista : motoristas.values())
		{
			if (motorista.nome() == nome)
			{
				return Retorno.retornarSucesso(motorista);
			}
		}
	}

	@Override
	public Retorno<Motorista> obterPorCpf(String cpf)
	{
		Motorista motorista = motoristas.get(cpf);
		if (motorista == null)
		{
			return Retorno.retornarFalha("Motorista inexistente: " + cpf);
		}
		return Retorno.retornarSucesso(motorista);
	}
}
