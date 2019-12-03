package com.Urbe.testes.casos_de_uso.politicas;

import com.urbe.casos_de_uso.politicas.CustoViagem;
import com.urbe.entidades.*;
import com.urbe.entidades.geometria.Area;
import com.urbe.entidades.geometria.Ponto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoCustoViagemTest
{
	List<FormaPagamento> f1;
	FormaPagamento f2;
	LocalDateTime tm;
	private Viagem viagem1;
	private Veiculo v1;
	private Passageiro p1;
	private Motorista m1;
	private Cidade city;
	private Area a1, a2;
	private Bairro b1, b2;

	@BeforeEach
	public void setup()
	{
		VeiculosFactory vf = VeiculosFactory.getInstance();
		city = Cidade.criaCidade("myCity");
		f1 = new LinkedList<FormaPagamento>();
		f1.add(FormaPagamento.CREDITO);
		f2 = FormaPagamento.CREDITO;

		v1 = vf.createInstance("ABC1234", "seila", "branco", "SIMPLES");

		m1 = Motorista.novoMotorista("12312312311", "jaozin", v1, f1);
		p1 = Passageiro.novoPassageiro("123123311", "jaozino", f2);

		b1 = new Bairro("Petropolis", new Area(new Ponto(0, 12), new Ponto(4, 8)), 10);
		b2 = new Bairro("Ipiranga", new Area(new Ponto(4, 10), new Ponto(8, 8)), 6);
		city.regBairro(b1);
		city.regBairro(b2);
		tm = LocalDateTime.now();

		viagem1 = Viagem.novaViagem(2, city, b1, b2, m1, p1, 100);
	}

	@DisplayName("Testa Viagem Basica")
	@Test
	public void testaCustoViagemBasica()
	{
		double custo = CustoViagem.criaCustoViagem("Basico")
							.custoViagem(city, b1, b2, p1, v1);
		assertEquals(12, custo);
	}


}