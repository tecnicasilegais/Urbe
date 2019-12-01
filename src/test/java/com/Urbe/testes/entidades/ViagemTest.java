package com.Urbe.testes.entidades;

import com.urbe.entidades.Bairro;
import com.urbe.entidades.Cidade;
import com.urbe.entidades.FormaPagamento;
import com.urbe.entidades.Motorista;
import com.urbe.entidades.Passageiro;
import com.urbe.entidades.Veiculo;
import com.urbe.entidades.VeiculosFactory;
import com.urbe.entidades.Viagem;
import com.urbe.entidades.geometria.Area;
import com.urbe.entidades.geometria.Ponto;
import com.urbe.entidades.geometria.Reta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class ViagemTest
{
    List<FormaPagamento> f1;
    FormaPagamento f2;
    private Viagem viagem1, viagem2;
    private Veiculo v1;
    private Passageiro p1;
    private Motorista m1;
    private Cidade city;
    private Area a1,a2;
    LocalDateTime tm;
    private Bairro b1,b2;
    private Reta ret;

	@BeforeEach
	public void setup()
	{
        VeiculosFactory vf = VeiculosFactory.getInstance();
        city = Cidade.criaCidade("myCity");
        f1 = new LinkedList<FormaPagamento>();
        f1.add(FormaPagamento.CREDITO);
        f2 = FormaPagamento.CREDITO;
        
        v1 = vf.createInstance("ABC1234", "seila", "branco", "SIMPLES");

        m1 = Motorista.novoMotorista("12312312311","jaozin",v1,f1);
        p1 = Passageiro.novoPassageiro("123123311","jaozino",f2);

        a1 = new Area(new Ponto(0,12), new Ponto(4,8));
        a2 = new Area(new Ponto(0,8), new Ponto(2,4));
        b1 = new Bairro("bairro normal",a1,4); 
        b2 = new Bairro("bairro tbm normal", a2, 8);

        ret = new Reta(a1.pontoCentral(), a2.pontoCentral());

        tm = LocalDateTime.now();

        viagem1 = Viagem.novaViagem(2, city, b1, b2, m1, p1, 100);
        viagem2 = Viagem.viagemExistente(1, tm, city, b2, b1, m1, p1,20);
    }
    
    @DisplayName("Testa Id")
    @Test
    public void testaId(){
        assertEquals(1, viagem2.id());
    }

    @DisplayName("Testa horario")
    @Test
    public void testaHorario(){
        assertEquals(tm, viagem2.horario());
    }

    @DisplayName("Testa cidade")
    @Test
    public void testaCidade(){
        assertEquals(city.nome(), viagem1.cidade().nome());
    }

    @DisplayName("Testa Origem")
    @Test
    public void testaOrigem(){
        assertEquals(b1.nome(), viagem1.origem().nome());
    }
    @DisplayName("Testa Destino")
    @Test
    public void testaDestino(){
        assertEquals(b2.nome(), viagem1.destino().nome());
    }

    @DisplayName("Testa Motorista")
    @Test
    public void testaMotorista(){
        assertEquals(m1.cpf(), viagem2.motorista().cpf());
    }
    
    @DisplayName("Testa Passageiro")
    @Test
    public void testaPassageiro(){
        assertEquals(p1.cpf(), viagem2.passageiro().cpf());
    }

    @DisplayName("Testa Custo")
    @Test
    public void testaCusto(){
        assertEquals(20, viagem2.custo());
    }
    @DisplayName("Testa Rota")
    @Test
    public void testaRota(){
        assertEquals(ret, viagem1.rota());
    }
}