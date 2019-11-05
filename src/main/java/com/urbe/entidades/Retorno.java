package com.urbe.entidades;

public class Retorno
{
	private boolean ok;
	private String mensagem;

	public Retorno(boolean ok, String mensagem)
	{
		this.ok = ok;
		this.mensagem = mensagem;
	}

	public boolean ok()
	{
		return this.ok;
	}

	public String mensagem()
	{
		return this.mensagem;
	}
}
