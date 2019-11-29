package com.Urbe.testes.entidades;

import com.urbe.entidades.geometria.SituacaoReta;
import com.urbe.entidades.Bairro;
import com.urbe.entidades.geometria.Area;
import com.urbe.entidades.geometria.Ponto;
import com.urbe.entidades.geometria.Reta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BairroTest
{
    private Ponto ponto;
    private Bairro bairroPadraoTestes;

	@BeforeEach
	public void setup()
	{
		ponto = new Ponto(10, 20);
        bairroPadraoTestes = Bairro.criaBairroQuadrado("teste", ponto, 4, 5.0);   
    }
    
    @DisplayName("Testa Nome")
    public void testaNome(){
        Bairro bairro = Bairro.criaBairroRetangular("teste", ponto, 4, 6, 5.0);
        assertEquals("teste", bairro.getNome());
    }

    @DisplayName("Testa Custo")
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

    @DisplayName("Testa Excecao Custo Negativo")
    public void testaExcecao(){
        
    }
}