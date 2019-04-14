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
	public void testMoverse() {
		Tablero.getmiTablero().moverse(1, prota);
	}

	//constructura

	//otros_metodos
}
