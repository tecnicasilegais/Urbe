package com.urbe.interfaces.persistencia;

import com.urbe.casos_de_uso.repositorios.IRepositorioMotoristas;
import com.urbe.entidades.FormaPagamento;
import com.urbe.entidades.Motorista;
import com.urbe.entidades.Retorno;
import com.urbe.entidades.Veiculo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

		formasPgto.add(FormaPagamento.CREDITO);
		veiculo = repV.obterPorPlaca("NOR1234").dados();
		motorista = Motorista.novoMotorista("349983409-88", "Jose Norm", veiculo, formasPgto);
		motoristas.put(motorista.cpf(), motorista);

		formasPgto.set(0, FormaPagamento.DEBITO);
		veiculo = repV.obterPorPlaca("SIM1234").dados();
		motorista = Motorista.novoMotorista("786234902-33", "Aline Simp", veiculo, formasPgto);
		motoristas.put(motorista.cpf(), motorista);

		formasPgto.set(0, FormaPagamento.DINHEIRO);
		veiculo = repV.obterPorPlaca("LUX1234").dados();
		motorista = Motorista.novoMotorista("098276140-99", "Luciane Lux", veiculo, formasPgto);
		motoristas.put(motorista.cpf(), motorista);
	}

	@Override
	public Retorno<Motorista> obterPorNome(String nome)
	{
		for (Motorista motorista : motoristas.values())
		{
			if (motorista.nome().equals(nome))
			{
				return Retorno.retornarSucesso(motorista);
			}
		}
		return Retorno.retornarFalha("Motorista " + nome + " não encontrado");
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

	@Override
	public List<Motorista> listarMotoristas()
	{
		return motoristas.values().stream().collect(Collectors.toList());
	}
}
