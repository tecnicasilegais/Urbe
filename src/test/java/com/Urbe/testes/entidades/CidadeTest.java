package com.Urbe.testes.entidades;

import com.urbe.entidades.Bairro;
import com.urbe.entidades.Cidade;
import com.urbe.entidades.geometria.Area;
import com.urbe.entidades.geometria.Ponto;
import com.urbe.entidades.geometria.Reta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;

public class CidadeTest
{
    private Cidade city;
    private Area a1,a2,a3;
    private Bairro b1,b2,b3;
    private Reta ret;

	@BeforeEach
	public void setup()
	{
        city = Cidade.criaCidade("myCity");

        a1 = new Area(new Ponto(0,12), new Ponto(4,8));
        a2 = new Area(new Ponto(0,8), new Ponto(2,4));
        a3 = new Area(new Ponto(2,8), new Ponto(8,4));
        b1 = new Bairro("bairro normal",a1,4); 
        b2 = new Bairro("bairro tbm normal", a2, 8);
        b3 = new Bairro("bairro normal so q caro", a3, 50);
        ret = new Reta(a1.pontoCentral(), a3.pontoCentral());
    }
    
    @DisplayName("Testa Nome")
    @Test
    public void testaNome(){
        assertEquals("myCity", city.nome());
    }

    @DisplayName("Testa Inclui Bairro")
    @Test
    public void testaRegBairro(){
        city.regBairro(b3);
    }

    @DisplayName("Testes getBairro")
    @Test
	public void testaGetBairroSucesso()
	{
        city.regBairro(b1);
        assertEquals("bairro normal", city.bairro(b1.nome()).nome());
        assertEquals(b1.custoBase(), city.bairro(b1.nome()).custoBase());
    }

    @DisplayName("Testes getBairro nulo")
    @Test
	public void testaGetBairroFalha()
	{
        assertNull(city.bairro("testefalha"));
    }

    @DisplayName("Testa ListaNomesBairros")
    @Test
    public void testaListaNomesBairros()
    {
        city.regBairro(b1);
        city.regBairro(b2);
        city.regBairro(b3);
        assertEquals(3, city.listarNomesBairros().size());
        assertTrue(city.listarNomesBairros().contains(b1.nome()));
        assertTrue(city.listarNomesBairros().contains(b2.nome()));
        assertTrue(city.listarNomesBairros().contains(b3.nome()));
    }

    @DisplayName("Testa BairrosPercorridos")
    @Test
    public void testaBairrosPercorridos()
    {
        city.regBairro(b1);
        city.regBairro(b2);
        city.regBairro(b3);
        Collection<Bairro> bairros = city.bairrosPercorridos(ret);
        assertEquals(3, bairros.size());
        assertTrue(bairros.contains(b1));
        assertTrue(bairros.contains(b2));
        assertTrue(bairros.contains(b3));
    }

}