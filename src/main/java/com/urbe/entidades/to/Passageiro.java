package com.urbe.entidades.to;

public class Passageiro
{
	private String cpf;
	private String nome;
	private int nota;
	private int qtdAvaliacoes;

	public Passageiro(String cpf, String nome, int nota, int qtdAvaliacoes)
	{
		this.cpf = cpf;
		this.nome = nome;
		this.nota = nota;
		this.qtdAvaliacoes = qtdAvaliacoes;
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

	//endregion
}
