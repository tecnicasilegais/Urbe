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

	public static Passageiro novoPassageiroSalvo(String cpf, String nome, FormaPagamento formaPagamento, int somaAvaliacoes, int qtdAvaliacoes)
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

	// region Getters/Setters
	public double getNota()
	{
		return this.somaAvaliacoes / this.qtdAvaliacoes;
	}

	public String getCpf()
	{
		return cpf;
	}

	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public int getSomaAvaliacoes()
	{
		return somaAvaliacoes;
	}

	public void setSomaAvaliacoes(int somaAvaliacoes)
	{
		this.somaAvaliacoes = somaAvaliacoes;
	}

	public int getQtdAvaliacoes()
	{
		return qtdAvaliacoes;
	}

	public void setQtdAvaliacoes(int qtdAvaliacoes)
	{
		this.qtdAvaliacoes = qtdAvaliacoes;
	}

	//endregion
}
