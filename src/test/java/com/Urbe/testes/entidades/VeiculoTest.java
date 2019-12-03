package com.Urbe.testes.entidades;

import com.urbe.entidades.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VeiculoTest
{
	private Veiculo v1, v2, v3;

	@BeforeEach
	public void setup()
	{
		VeiculosFactory vf = VeiculosFactory.getInstance();
		v1 = vf.createInstance("ABC1234", "seila", "branco", "SIMPLES");
		v2 = vf.createInstance("XSX2323", "seila2", "azul", "NORMAL");
		v3 = vf.createInstance("XYA2302", "corsa", "preto", "LUXO");

	}

	@DisplayName("Testa placa")
	@Test
	public void testaPlaca()
	{
		assertEquals("ABC1234", v1.placa());
	}

	@DisplayName("Testa Marca")
	@Test
	public void testaMarca()
	{
		assertEquals("seila2", v2.marca());
	}

	@DisplayName("Testa cor")
	@Test
	public void testaCor()
	{
		assertEquals("preto", v3.cor());
	}

	@DisplayName("Testa criaçao Veiculo Simples")
	@Test
	public void testaVeiculoSimples()
	{
		assertTrue(v1 instanceof VeiculoSimples);
	}

	@DisplayName("Testa criaçao Veiculo Normal")
	@Test
	public void testaVeiculoNormal()
	{
		assertTrue(v2 instanceof VeiculoNormal);
	}

	@DisplayName("Testa criaçao Veiculo Luxo")
	@Test
	public void testaVeiculoLuxo()
	{
		assertTrue(v3 instanceof VeiculoLuxo);
	}

	@DisplayName("Testa Atende categoria inferior apos inicializar")
	@Test
	public void testaCategoriaInferior()
	{
		assertTrue(((VeiculoNormal) v2).atendeCategoriaInferior());
	}

	@DisplayName("Testa Atende categoria inferior apos inicializar")
	@Test
	public void testaCategoriaInferiorLuxo()
	{
		assertTrue(((VeiculoLuxo) v3).atendeCategoriaInferior());
	}

	@DisplayName("Testa tem bagageiro grande")
	@Test
	public void testaBagageiroGrande()
	{
		assertTrue(((VeiculoLuxo) v3).temBagageiroGrande());
	}

	@DisplayName("Testa muda bagageiro grande")
	@Test
	public void testaMudaBagageiroGrande()
	{
		((VeiculoLuxo) v3).bagageiroGrande(false);
		assertFalse(((VeiculoLuxo) v3).temBagageiroGrande());
	}

	@DisplayName("Testa muda atende cat inferior")
	@Test
	public void testaMudaAtendeInferior()
	{
		((VeiculoNormal) v2).atendeCategoriaInferior(false);
		assertFalse(((VeiculoNormal) v2).atendeCategoriaInferior());
	}
}