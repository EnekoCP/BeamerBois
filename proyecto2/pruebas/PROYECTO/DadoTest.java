package PROYECTO;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DadoTest {

	@Before
	public void setUp() throws Exception {
	}
	//atributos 

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTirarDado() {
		assertEquals(Dado.getDado().tirarDado(),6);
	}

	//constructura

	//otros_metodos
}
