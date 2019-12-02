package com.urbe.entidades;

@SuppressWarnings("rawtypes")
public class Retorno<E>
{
	private boolean ok;
	private String mensagem;
	private E dados;

	public static <T> Retorno<T> retornarSucesso(T conteudo)
	{
		return new Retorno<T>(true, conteudo, "Sucesso");
	}

	public static <T> Retorno retornarFalha(String mensagem)
	{
		return new Retorno<T>(false, null, mensagem);
	}

	private Retorno(boolean ok, E dados, String mensagem)
	{
		this.ok = ok;
		this.mensagem = mensagem;
		this.dados = dados;
	}

	public boolean ok()
	{
		return this.ok;
	}

	public String mensagem()
	{
		return this.mensagem;
	}

	public E dados()
	{
		return this.dados;
	}
}
