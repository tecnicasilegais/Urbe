package com.urbe.entidades;

public class Passageiro
{
	private String cpf;
	private String nome;
	private FormaPagamento formaPagamento;
	private int somaAvaliacoes;
	private int qtdAvaliacoes;

	public static Passageiro novoPassageiro(String cpf, String nome, FormaPagamento formaPagamento)
	{
		final int avaliacaoInicial = 8;
		final int nroAvaliacoesInicial = 1;
		return new Passageiro(cpf, nome, formaPagamento, avaliacaoInicial, nroAvaliacoesInicial);
	}

	public static Passageiro novoPassageiroExistente(String cpf, String nome, FormaPagamento formaPagamento, int somaAvaliacoes, int qtdAvaliacoes)
	{
		return new Passageiro(cpf, nome, formaPagamento, somaAvaliacoes, qtdAvaliacoes);
	}

	private Passageiro(String cpf, String nome, FormaPagamento formaPagamento, int somaAvaliacoes, int qtdAvaliacoes)
	{
		this.cpf = cpf;
		this.nome = nome;
		this.formaPagamento = formaPagamento;
		this.somaAvaliacoes = somaAvaliacoes;
		this.qtdAvaliacoes = qtdAvaliacoes;
	}

	// region getters/setters
	public double nota()
	{
		return this.somaAvaliacoes / this.qtdAvaliacoes;
	}

	public String cpf()
	{
		return cpf;
	}

	public void cpf(String cpf)
	{
		this.cpf = cpf;
	}

	public String nome()
	{
		return nome;
	}

	public void nome(String nome)
	{
		this.nome = nome;
	}

	public int somaAvaliacoes()
	{
		return somaAvaliacoes;
	}

	public void somaAvaliacoes(int somaAvaliacoes)
	{
		this.somaAvaliacoes = somaAvaliacoes;
	}

	public int qtdAvaliacoes()
	{
		return qtdAvaliacoes;
	}

	public void qtdAvaliacoes(int qtdAvaliacoes)
	{
		this.qtdAvaliacoes = qtdAvaliacoes;
	}

	//endregion
}
