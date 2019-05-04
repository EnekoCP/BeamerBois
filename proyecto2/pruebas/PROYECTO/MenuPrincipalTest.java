package PROYECTO;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MenuPrincipalTest {

	@Before
	public void setUp() throws Exception {
	}
	//atributos 

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMenuCombate() {
		assertEquals(MenuPrincipal.getMenuPrincipal().menuCombate(),"x");
		assertEquals(MenuPrincipal.getMenuPrincipal().menuCombate(),"z");
		assertEquals(MenuPrincipal.getMenuPrincipal().menuCombate(),"j");
	}

	//constructura

	//otros_metodos
}
