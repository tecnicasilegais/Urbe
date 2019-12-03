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
	private Veiculo v1,v2,v3;
	private Passageiro p1;
	private Cidade city;
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
		v2 = vf.createInstance("ABC1234", "seila", "branco", "NORMAL");
		v3 = vf.createInstance("ABC1234", "seila", "branco", "LUXO");

		p1 = Passageiro.novoPassageiro("123123311", "jaozino", f2);

		b1 = new Bairro("Petropolis", new Area(new Ponto(0, 12), new Ponto(4, 8)), 10);
		b2 = new Bairro("Ipiranga", new Area(new Ponto(4, 10), new Ponto(8, 8)), 6);
		city.regBairro(b1);
		city.regBairro(b2);
		tm = LocalDateTime.now();

	}

	@DisplayName("Testa Viagem Basica")
	@Test
	public void testaCustoViagemBasica()
	{
		double custo = CustoViagem.criaCustoViagem("Basico")
							.custoViagem(city, b1, b2, p1, v1);
		assertEquals(16, custo);
	}

	@DisplayName("Testa Viagem Normal")
	@Test
	public void testaCustoViagemNormal()
	{
		double custo = CustoViagem.criaCustoViagem("Basico")
							.custoViagem(city, b1, b2, p1, v2);
		assertEquals(16+16*0.1, custo);
	}

	@DisplayName("Testa Viagem Luxo")
	@Test
	public void testaCustoViagemLuxo()
	{
		double custo = CustoViagem.criaCustoViagem("Basico")
							.custoViagem(city, b1, b2, p1, v3);
		assertEquals(16+16*0.1+16*0.04, custo);
	}
}