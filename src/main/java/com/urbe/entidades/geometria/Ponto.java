package com.urbe.entidades.geometria;

public class Ponto
{
	private int x;
	private int y;

	public Ponto(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString()
	{
		return "Ponto [x=" + x + ", y=" + y + "]";
	}

	//region Getters/Setters
	public int x()
	{
		return x;
	}

	public int y()
	{
		return y;
	}
	//endregion
}
