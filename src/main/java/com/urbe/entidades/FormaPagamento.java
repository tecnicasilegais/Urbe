package com.urbe.entidades;

public enum FormaPagamento
{
	CREDITO(0), DEBITO(1), DINHEIRO(2);
	public final int value;

	FormaPagamento(int valor) { value = valor; }
}