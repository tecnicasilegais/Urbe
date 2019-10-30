package com.urbe.entidades.geometria;

import com.urbe.entidades.enums.SituacaoReta;

import static com.urbe.entidades.enums.RegiaoPonto.*;
import static com.urbe.entidades.enums.SituacaoReta.*;

public class Area
{
	private Ponto pSupEsq, pInfDir;
	private int yMin, yMax, xMin, xMax;

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
			this.yMin = pInfDir.getY();
			this.yMax = pSupEsq.getY();
			this.xMin = pSupEsq.getX();
			this.xMax = pInfDir.getX();
		}
	}

	public SituacaoReta classifica(Reta reta)
	{
		SituacaoReta situacao = INTERSECTA;
		int regiaoP1 = getRegiao(reta.getP1());
		int regiaoP2 = getRegiao(reta.getP2());

		if (regiaoP1 == 0 && regiaoP2 == 0)
		{
			situacao = TODA_DENTRO;
		}
		else if ((regiaoP1 & regiaoP2) != 0)
		{
			situacao = TODA_FORA;
		}
		return situacao;
	}

	public int getRegiao(Ponto ponto)
	{
		int regiao = 0; //Dentro

		if (ponto.getX() < xMin) { regiao += ESQUERDA.value; }
		else if (ponto.getX() > xMax) { regiao += DIREITA.value; }

		if (ponto.getY() < yMin) { regiao += ABAIXO.value; }
		else if (ponto.getY() > yMax) { regiao += ACIMA.value; }

		return regiao;
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
