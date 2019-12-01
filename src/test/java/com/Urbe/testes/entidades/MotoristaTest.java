package com.Urbe.testes.entidades;

import com.urbe.entidades.FormaPagamento;
import com.urbe.entidades.Motorista;
import com.urbe.entidades.Veiculo;
import com.urbe.entidades.VeiculosFactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedList;
import java.util.List;


public class MotoristaTest
{
    List<FormaPagamento> f1,f2;
    private Motorista mNovo;
    private Motorista mExistente;
    private Veiculo v1, v2;
	@BeforeEach
	public void setup()
	{
        f1 = new LinkedList<FormaPagamento>();
        f2 = new LinkedList<FormaPagamento>();
        f1.add(FormaPagamento.CREDITO);
        f2.add(FormaPagamento.DEBITO);
        f2.add(FormaPagamento.DINHEIRO);
        v1 = VeiculosFactory.getInstance().createInstance("x12131231", "seila", "branco", "SIMPLES");
        v2 = VeiculosFactory.getInstance().createInstance("xdasdasda","seila2","azul","NORMAL");
        mNovo = Motorista.novoMotorista("12312312311","jaozin",v1,f1);
        mExistente = Motorista.motoristaExistente("123123123", "adasdasd", 90, 10, v2, f2);

    }
    
    @DisplayName("Testa Nome")
    @Test
    public void testaNome(){
        assertEquals("x12131231", mNovo.nome());
    }

    @DisplayName("Testa pontuacao Media")
    @Test
    public void testaPontuacaoMedia(){
        assertEquals(9, mExistente.pontuacaoMedia());
    }

    @DisplayName("Testa pontuacao Media")
    @Test
    public void testaPontuacaoMedia2(){
        assertEquals(8, mNovo.pontuacaoMedia());
    }

    @DisplayName("Testa cpf")
    @Test
    public void testaCpf(){
        assertEquals("seila", mNovo.cpf());
    }

    @DisplayName("Testa soma avaliações")
    @Test
    public void testaSomaAvaliacoes(){
        assertEquals(90, mExistente.somaAvaliacoes());
    }

    @DisplayName("Testa qtd avaliações")
    @Test
    public void testaQtdAvaliacoes(){
        assertEquals(10, mExistente.qtdAvaliacoes());
    }

    @DisplayName("Testa Veiculo")
    @Test
    public void testaVeiculo(){
        assertEquals("x12131231",mNovo.veiculo().placa());
    }

    @DisplayName("Testa formas pgto")
    @Test
    public void testaFormasPgto(){
        assertTrue(mExistente.formasPagamento().contains(FormaPagamento.DEBITO));
    }

    @DisplayName("Testa avalia com sucesso")
	@CsvSource({"10","9","8","5","0","3"})
    public void testaAvaliaSucesso(int avaliacao){
        mNovo.avalia(avaliacao);
        assertEquals((8+avaliacao)/2, mNovo.pontuacaoMedia());
        assertEquals(2,mNovo.qtdAvaliacoes());
    }

    @DisplayName("Testa avalia excecao")
    @Test
    public void testaAvaliaExcecao(){
        
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> mNovo.avalia(-1), "Didnt throw");
        assertTrue(thrown.getMessage().contains("Pontuação inválida ! Deve ser uma pontuação de 0 a 10."));
    }
    @DisplayName("Testa avalia excecao")
    @Test
    public void testaAvaliaExcecao2(){
        
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> mNovo.avalia(11), "Didnt throw");
        assertTrue(thrown.getMessage().contains("Pontuação inválida ! Deve ser uma pontuação de 0 a 10."));
    }
}