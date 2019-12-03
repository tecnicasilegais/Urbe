package com.Urbe.testes.entidades;

import com.urbe.entidades.Bairro;
import com.urbe.entidades.geometria.Area;
import com.urbe.entidades.geometria.Ponto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class BairroTest
{
	private Area a1, a2;
	private Bairro bairroPadraoTestes;

	@BeforeEach
	public void setup()
	{
		a1 = new Area(new Ponto(0, 12), new Ponto(4, 8));
		a2 = new Area(new Ponto(0, 8), new Ponto(2, 4));
		bairroPadraoTestes = new Bairro("teste", a1, 5.0);
	}

	@DisplayName("Testa Nome")
	@Test
	public void testaNome()
	{
		Bairro bairro = new Bairro("teste", a2, 5.0);
		assertEquals("teste", bairro.nome());
	}

	@DisplayName("Testa Custo")
	@Test
	public void testaCusto()
	{
		assertEquals(5.0, bairroPadraoTestes.custoBase());
	}

	@DisplayName("Testes muda custo")
	@ParameterizedTest
	@CsvSource({"1.0",
			"15.3",
			"0.0",
			"0.1",
			"9.0",
			"3.4",
			"123123123.2"
	})
	public void testaMudaCusto(double novoCusto)
	{
		bairroPadraoTestes.mudaCustoBase(novoCusto);
		assertEquals(novoCusto, bairroPadraoTestes.custoBase());
	}

	@Test
	@DisplayName("Testa Excecao Custo Negativo")
	public void testaExcecao()
	{
		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> bairroPadraoTestes.mudaCustoBase(-1), "Didnt throw");
		assertTrue(thrown.getMessage().contains("Valor inválido"));
	}

}