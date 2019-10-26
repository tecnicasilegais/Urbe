package com.urbe.entidades.to;

public class Roteiro
{
	private Cidade cidade;
	private Bairro bairroOrigem;
	private Bairro bairroDestino;

	public Roteiro(Cidade cidade)
	{
		this.cidade = cidade;
	}

	// region Getters/Setters
	public Cidade getCidade()
	{
		return cidade;
	}

	public void setCidade(Cidade cidade)
	{
		this.cidade = cidade;
	}

	public Bairro getBairroOrigem()
	{
		return bairroOrigem;
	}

	public void setBairroOrigem(Bairro bairroOrigem)
	{
		this.bairroOrigem = bairroOrigem;
	}

	public Bairro getBairroDestino()
	{
		return bairroDestino;
	}

	public void setBairroDestino(Bairro bairroDestino)
	{
		this.bairroDestino = bairroDestino;
	}

	//endregion
}
