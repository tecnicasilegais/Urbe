package com.urbe.casos_de_uso.politicas;

public enum Mensagens
{
	CPF_NAO_INFORMADO("CPF não informado."),
	CPF_INVALIDO("CPF inválido."),
	NOTA_INVALIDA("Nota informada deve estar entre 0 e 10."),
	SUCESSO_OBTER("Obtido com sucesso."),
	SUCESSO_ALTERAR("Alterado com sucesso.");
	public final String mensagem;

	Mensagens(String mensagem)
	{
		this.mensagem = mensagem;
	}
}
