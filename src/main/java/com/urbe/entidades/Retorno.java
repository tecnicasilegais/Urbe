package com.urbe.entidades;

public class Retorno<E>
{
	private boolean ok;
	private String mensagem;
	private E dados;

	public Retorno(boolean ok, String mensagem)
	{
		this.ok = ok;
		this.mensagem = mensagem;
		this.dados = null;
	}

	public Retorno(boolean ok, E dados, String mensagem)
	{
		this.ok = ok;
		this.mensagem = mensagem;
		this.dados = dados;
	}

	public Retorno(E dados, String mensagem)
	{
		if (dados == null){
			this.ok = false;
		}
		this.dados = dados;
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

	public E dados() {return this.dados;}
}
