package com.urbe.casos_de_uso.politicas;

import com.urbe.entidades.Motorista;
import com.urbe.entidades.Retorno;

import static com.urbe.casos_de_uso.politicas.Mensagens.*;

public class RnMotorista
{
	public Retorno alterarNota(Motorista motorista)
	{
		if (motorista.getCpf() == null)
		{
			return new Retorno(false, CPF_NAO_INFORMADO.mensagem);
		}
		if (motorista.getNota() < 0 || motorista.getNota() > 10)
		{
			return new Retorno(false, NOTA_INVALIDA.mensagem);
		}

		//TODO implementação
		return new Retorno(true, SUCESSO_ALTERAR.mensagem);
	}

	public Retorno obter(Motorista motorista)
	{
		if (motorista.getCpf() == null)
		{
			return new Retorno(false, CPF_NAO_INFORMADO.mensagem);
		}

		//TODO implementação
		return new Retorno(true, SUCESSO_OBTER.mensagem);
	}
}
