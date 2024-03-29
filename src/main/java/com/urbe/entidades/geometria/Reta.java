package com.urbe.entidades.geometria;

public class Reta
{
	private Ponto p1, p2;

	public Reta(Ponto p1, Ponto p2)
	{
		this.p1 = p1;
		this.p2 = p2;
	}

	public double tamanho()
	{
		return Math.sqrt(
				Math.pow(p2.x() - p1.x(), 2) +
						Math.pow(p2.y() - p1.y(), 2));
	}

	//region Getters/Setters
	public Ponto p1()
	{
		return p1;
	}

	public Ponto p2()
	{
		return p2;
	}
	//endregion

	@Override
	public boolean equals(Object other)
	{
		if (this == other)
		{ return true; }

		if (other == null || other.getClass() != this.getClass())
		{ return false; }

		Reta otherReta = (Reta) other;

		return (this.p1.equals(otherReta.p1)) &&
				this.p2.equals(otherReta.p2);
	}

	@Override
	public String toString()
	{
		return "Reta [p1=" + p1 + ", p2=" + p2 + "]";
	}
}
