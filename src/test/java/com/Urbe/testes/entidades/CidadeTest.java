package com.Urbe.testes.entidades;

import com.urbe.entidades.Bairro;
import com.urbe.entidades.Cidade;
import com.urbe.entidades.geometria.Area;
import com.urbe.entidades.geometria.Ponto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CidadeTest
{
    private Ponto p1;
    private Area a1, a2;
    private Bairro bairroPadraoTestes;

	@BeforeEach
	public void setup()
	{
        p1 = new Ponto(10, 20);
        a1 = new Area(p1, new Ponto(10, 10));
        a2 = new Area(p1, new Ponto(10, 15));
        bairroPadraoTestes = new Bairro("teste", a1, 5.0);   
    }
    
    @DisplayName("Testa Nome")
    @Test
    public void testaNome(){
        Bairro bairro = new Bairro("teste", a2 , 5.0);
        assertEquals("teste", bairro.getNome());
    }

    @DisplayName("Testa Custo")
    @Test
    public void testaCusto(){
        assertEquals(5.0, bairroPadraoTestes.getCustoBase());
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
        bairroPadraoTestes.setCustoBase(novoCusto);
        assertEquals(novoCusto, bairroPadraoTestes.getCustoBase());
    }

    @Test
    @DisplayName("Testa Excecao Custo Negativo")
    public void testaExcecao(){
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> bairroPadraoTestes.setCustoBase(-1), "Didnt throw");
        assertTrue(thrown.getMessage().contains("Valor inválido"));    
    }

}