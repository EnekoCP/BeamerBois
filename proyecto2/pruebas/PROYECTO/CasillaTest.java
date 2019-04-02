package PROYECTO;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CasillaTest {
	Casilla c;

	@Before
	public void setUp() throws Exception {
		c=new Casilla(10);
	}
	//atributos 

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCasilla() {
		fail("Not yet implemented");
	}

	@Test
	public void testAñadirEvento() {
		fail("Not yet implemented");
	}

	@Test
	public void testImprimir() {
		c.imprimir();
	}

	//constructura

	//otros_metodos
}
