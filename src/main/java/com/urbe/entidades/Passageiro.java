package com.urbe.entidades;

public class Passageiro
{
	private String cpf;
	private String nome;
	private int somaAvaliacoes;
	private int qtdAvaliacoes;

	public Passageiro(String cpf, String nome, int somaAvaliacoes, int qtdAvaliacoes)
	{
		this.cpf = cpf;
		this.nome = nome;
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
