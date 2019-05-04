package PROYECTO;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaEventosTest {

	@Before
	public void setUp() throws Exception {
	}
	//atributos 

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetListaEventos() {
		assertEquals(ListaEventos.getListaEventos().ListaEventosA().size(),31);
	}

	//constructura

	//otros_metodos
}
