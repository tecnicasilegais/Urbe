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

	@Override
	public boolean equals(Object other)
	{
		if (this == other)
		{ return true; }

		if (other == null || other.getClass() != this.getClass())
		{ return false; }

		Ponto otherPonto = (Ponto) other;

		return (this.x == otherPonto.x) &&
				(this.y == otherPonto.y);
	}

	@Override
	public String toString()
	{
		return "Ponto [x=" + x + ", y=" + y + "]";
	}

}
