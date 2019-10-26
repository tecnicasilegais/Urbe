package com.urbe.entidades.to;

import com.urbe.entidades.enums.FormaPagamento;

public class Motorista
{
	private String cpf;
	private String nome;
	private int nota;
	private int qtdAvaliacoes;
	private Veiculo veiculo;
	private FormaPagamento formaPagamento;

	public Motorista(String cpf, String nome, Veiculo veiculo, FormaPagamento formaPagamento)
	{
		this.cpf = cpf;
		this.nome = nome;
		this.nota = 0;
		this.qtdAvaliacoes = 0;
		this.veiculo = veiculo;
		this.formaPagamento = formaPagamento;
	}

	public Motorista(String cpf, String nome, int nota, int qtdAvaliacoes, Veiculo veiculo, FormaPagamento formaPagamento)
	{
		this.cpf = cpf;
		this.nome = nome;
		this.nota = nota;
		this.qtdAvaliacoes = qtdAvaliacoes;
		this.veiculo = veiculo;
		this.formaPagamento = formaPagamento;
	}

	// region Getters/Setters
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

	public int getNota()
	{
		return nota;
	}

	public void setNota(int nota)
	{
		this.nota = nota;
	}

	public int getQtdAvaliacoes()
	{
		return qtdAvaliacoes;
	}

	public void setQtdAvaliacoes(int qtdAvaliacoes)
	{
		this.qtdAvaliacoes = qtdAvaliacoes;
	}

	public Veiculo getVeiculo()
	{
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo)
	{
		this.veiculo = veiculo;
	}

	public FormaPagamento getFormaPagamento()
	{
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento)
	{
		this.formaPagamento = formaPagamento;
	}

	//endregion
}
