package com.urbe.entidades.geometria;

import static com.urbe.entidades.geometria.RegiaoPonto.*;
import static com.urbe.entidades.geometria.SituacaoReta.*;

public class Area
{
	private Ponto pSupEsq, pInfDir;
	private int yMin, yMax, xMin, xMax;

	public Area(Ponto pSupEsq, Ponto pInfDir)
	{
		if ((pSupEsq.x() >= pInfDir.x()) || (pSupEsq.y() <= pInfDir.y()))
		{
			throw new IllegalArgumentException("O retangulo deve ser definido pela diagonal principal");
		}
		else
		{
			this.pSupEsq = pSupEsq;
			this.pInfDir = pInfDir;
			this.yMin = pInfDir.y();
			this.yMax = pSupEsq.y();
			this.xMin = pSupEsq.x();
			this.xMax = pInfDir.x();
		}
	}

	public Ponto pontoCentral()
	{
        int x = xMax+Math.abs(xMin - xMax);
        int y = yMax+Math.abs(yMin - yMax);
		return new Ponto(x, y);
	}

	public SituacaoReta classifica(Reta reta)
	{
		SituacaoReta situacao = INTERSECTA;
		int regiaoP1 = regiao(reta.p1());
		int regiaoP2 = regiao(reta.p2());

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

	public int regiao(Ponto ponto)
	{
		int regiao = 0; //Dentro

		if (ponto.x() < xMin) { regiao += ESQUERDA.value; }
		else if (ponto.x() > xMax) { regiao += DIREITA.value; }

		if (ponto.y() < yMin) { regiao += ABAIXO.value; }
		else if (ponto.y() > yMax) { regiao += ACIMA.value; }

		return regiao;
	}

	@Override
	public String toString()
	{
		return "Area [pInfDir=" + pInfDir + ", pSupEsq=" + pSupEsq + "]";
	}

	//endregion
}
