package Calculatrice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculatrice c;
	
	@Before
	public void setUp() {
		c = new Calculatrice();
	}

	@Test
	public void testSumar() {
		assertEquals(5, c.sum(3, 2));
	}
	
	@Test
	public void testRestar() {
		assertEquals(1, c.restar(3, 2));
	}
	
	@Test
	public void testMultiplicar() {
		assertEquals(6, c.multiplicar(3, 2));
	}
	
	@Test
	public void testCuadrado() {
		assertEquals(9, c.cuadrado(3));
	}
	
	@Test
	public void testEsPar() {
		assertEquals(false, c.esPar(7));
	}

}
