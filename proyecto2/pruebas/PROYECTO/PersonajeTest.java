package PROYECTO;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonajeTest {
	Protagonista prota; Enemigo ene;
	@Before
	public void setUp() throws Exception {
		prota = new Protagonista("Joao");
		ene= new Enemigo(100,35,3,30,"Dante");
	}
	//atributos 

	@After
	public void tearDown() throws Exception {
		prota=null;
		ene=null;
	}

	@Test
	public void testPersonaje() {
		assertNotNull(prota);
		assertNotNull(ene);
	}

	@Test
	public void testAtacar() {
		prota.atacar(ene);
		assertEquals(ene.getVida(),55);
		ene.atacar(prota);
		assertEquals(prota.getVida(),265);
	}

	@Test
	public void testComprobarVida() throws ProtaHaMuertoExcepcion {
		assertTrue(ene.comprobarVida());
		ene.setVida(101);
		assertFalse(ene.comprobarVida());
		
	}

	@Test
	public void testGettersAndSetters() {

		prota.setDanno(300);
		assertEquals(prota.getDanno(),300);
		prota.setExp(30);
		assertEquals(prota.getExp(),30);
		prota.setNivel(3);
		assertEquals(prota.getNivel(),3);
		prota.setVel(5);
		assertEquals(prota.getVelocidad(),5);
		prota.setNombre("jowe");
		assertEquals(prota.getNombre(),"jowe");
	
		
	}

	
	//otros_metodos
}
