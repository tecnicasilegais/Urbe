package com.urbe.entidades;

public class Motorista
{
	private String cpf;
	private String nome;
	private int somaAvaliacoes;
	private int qtdAvaliacoes;
	private Veiculo veiculo;
	private FormaPagamento formaPagamento;

	public Motorista(String cpf, String nome, Veiculo veiculo, FormaPagamento formaPagamento)
	{
		this.cpf = cpf;
		this.nome = nome;
		this.somaAvaliacoes = 0;
		this.qtdAvaliacoes = 0;
		this.veiculo = veiculo;
		this.formaPagamento = formaPagamento;
	}

	public Motorista(String cpf, String nome, int somaAvaliacoes, int qtdAvaliacoes, Veiculo veiculo, FormaPagamento formaPagamento)
	{
		this.cpf = cpf;
		this.nome = nome;
		this.somaAvaliacoes = somaAvaliacoes;
		this.qtdAvaliacoes = qtdAvaliacoes;
		this.veiculo = veiculo;
		this.formaPagamento = formaPagamento;
	}

	// region Getters/Setters
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

	public Veiculo veiculo()
	{
		return veiculo;
	}

	public void veiculo(Veiculo veiculo)
	{
		this.veiculo = veiculo;
	}

	public FormaPagamento formaPagamento()
	{
		return formaPagamento;
	}

	public void formaPagamento(FormaPagamento formaPagamento)
	{
		this.formaPagamento = formaPagamento;
	}

	//endregion
}
