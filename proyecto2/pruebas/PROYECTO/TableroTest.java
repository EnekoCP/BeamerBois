package PROYECTO;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TableroTest {
	Protagonista prota;
	@Before
	public void setUp() throws Exception {
		prota = new Protagonista("Vidoky");
	}
	//atributos 

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMoverse() throws ProtaHaMuertoExcepcion, ProtaHaGanadoExcepcion  {
		Tablero.getmiTablero().moverse(1, prota);
		assertEquals(Tablero.getmiTablero().getPosicion(),1);
	}
	
	@Test
	public void testInicializarCasilla() {
		assertEquals(Tablero.getmiTablero().ListaCasilla().size(),31);
	
	}


	//constructura

	//otros_metodos
}
