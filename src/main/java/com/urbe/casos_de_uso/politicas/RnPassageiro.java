package com.urbe.casos_de_uso.politicas;

import com.urbe.entidades.Passageiro;
import com.urbe.entidades.Retorno;

import static com.urbe.casos_de_uso.politicas.Mensagens.*;

public class RnPassageiro
{
	public Retorno alterarNota(Passageiro passageiro)
	{
		if (passageiro.getCpf() == null)
		{
			return new Retorno(false, CPF_NAO_INFORMADO.mensagem);
		}
		if (passageiro.getNota() < 0 || passageiro.getNota() > 10)
		{
			return new Retorno(false, NOTA_INVALIDA.mensagem);
		}

		//TODO implementação
		return new Retorno(true, SUCESSO_ALTERAR.mensagem);
	}

	public Retorno obter(Passageiro passageiro)
	{
		if (passageiro.getCpf() == null)
		{
			return new Retorno(false, CPF_NAO_INFORMADO.mensagem);
		}

		//TODO implementação
		return new Retorno(true, SUCESSO_OBTER.mensagem);
	}
}
