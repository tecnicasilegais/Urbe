package com.urbe.entidades.geometria;

import com.urbe.entidades.enums.SituacaoReta;

public class Area
{
	private Ponto pSupEsq, pInfDir;

	public Area(Ponto pSupEsq, Ponto pInfDir)
	{
		if ((pSupEsq.getX() >= pInfDir.getX()) || (pSupEsq.getY() <= pInfDir.getY()))
		{
			throw new IllegalArgumentException("O retangulo deve ser definido pela diagonal principal");
		}
		else
		{
			this.pSupEsq = pSupEsq;
			this.pInfDir = pInfDir;
		}
	}

	public SituacaoReta classifica(Reta reta)
	{
		//TODO: implementar Cohen e Shuterland
		return null;
	}

	@Override
	public String toString()
	{
		return "Area [pInfDir=" + pInfDir + ", pSupEsq=" + pSupEsq + "]";
	}

	//region Getters/Setters
	public Ponto getPSupEsq()
	{
		return pSupEsq;
	}

	public Ponto getPInfDir()
	{
		return pInfDir;
	}
	//endregion
}
