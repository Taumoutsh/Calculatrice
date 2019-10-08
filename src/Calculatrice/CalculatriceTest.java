package Calculatrice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatriceTest {

	@Test
	void testSumar() {
		Calculatrice c = new Calculatrice();
		
		assertEquals(5, c.sum(3, 2));
	}
	
	@Test
	void testRestar() {
		Calculatrice c = new Calculatrice();
		
		assertEquals(1, c.restar(3, 2));
	}
	
	@Test
	void testMultiplicar() {
		Calculatrice c = new Calculatrice();
		
		assertEquals(6, c.multiplicar(3, 2));
	}
	
	@Test
	void testEsPar() {
		Calculatrice c = new Calculatrice();
		
		assertEquals(false, c.esPar(7));
	}

}
