package com.Urbe.testes.entidades;

import com.urbe.entidades.FormaPagamento;
import com.urbe.entidades.Passageiro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PassageiroTest
{
    FormaPagamento f1,f2;
    private Passageiro pNovo;
    private Passageiro pExistente;
	@BeforeEach
	public void setup()
	{
        f1 = FormaPagamento.CREDITO;
        f2 = FormaPagamento.DINHEIRO;
        pNovo = Passageiro.novoPassageiro("12312312311","jaozin",f1);
        pExistente = Passageiro.novoPassageiroExistente("123123123", "adasdasd", f2, 90, 10);

    }
    
    @DisplayName("Testa Nome")
    @Test
    public void testaNome(){
        assertEquals("jaozin", pNovo.nome());
    }

    @DisplayName("Testa pontuacao Media")
    @Test
    public void testaPontuacaoMedia(){
        assertEquals(9, pExistente.pontuacaoMedia());
    }

    @DisplayName("Testa pontuacao Media")
    @Test
    public void testaPontuacaoMedia2(){
        assertEquals(8, pNovo.pontuacaoMedia());
    }

    @DisplayName("Testa cpf")
    @Test
    public void testaCpf(){
        assertEquals("12312312311", pNovo.cpf());
    }

    @DisplayName("Testa soma avaliações")
    @Test
    public void testaSomaAvaliacoes(){
        assertEquals(90, pExistente.somaAvaliacoes());
    }

    @DisplayName("Testa qtd avaliações")
    @Test
    public void testaQtdAvaliacoes(){
        assertEquals(10, pExistente.qtdAvaliacoes());
    }

    @DisplayName("Testa forma pgto")
    @Test
    public void testaFormaPgto(){
        assertTrue(pExistente.formaPagamento()==FormaPagamento.DINHEIRO);
    }

    @DisplayName("Testa avalia com sucesso")
    @ParameterizedTest
	@CsvSource({"10","9","8","5","0","3"})
    public void testaAvaliaSucesso(int avaliacao){
        pNovo.avalia(avaliacao);
        assertEquals((8+avaliacao)/2, pNovo.pontuacaoMedia());
        assertEquals(2,pNovo.qtdAvaliacoes());
    }

    @DisplayName("Testa avalia excecao")
    @Test
    public void testaAvaliaExcecao(){
        
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> pNovo.avalia(-1), "Didnt throw");
        assertTrue(thrown.getMessage().contains("Pontuação inválida ! Deve ser uma pontuação de 0 a 10."));
    }
    @DisplayName("Testa avalia excecao")
    @Test
    public void testaAvaliaExcecao2(){
        
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> pNovo.avalia(11), "Didnt throw");
        assertTrue(thrown.getMessage().contains("Pontuação inválida ! Deve ser uma pontuação de 0 a 10."));
    }
}