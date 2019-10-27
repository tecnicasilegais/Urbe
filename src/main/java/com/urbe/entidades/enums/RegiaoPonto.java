package com.urbe.entidades.enums;

public enum RegiaoPonto
{
	DENTRO(0), ESQUERDA(1), DIREITA(2), ABAIXO(4), ACIMA(8);
	public final int value;

	RegiaoPonto(int i)
	{
		value = i;
	}
}
