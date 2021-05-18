/**
 * 
 */
package Calculadora;

<<<<<<< HEAD
import static org.junit.Assert.assertEquals;
=======
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
>>>>>>> cb96dbfcb9c6e14e04719fe76e7643abc702955a
import org.junit.Test;



<<<<<<< HEAD


//import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Test;




class CalcTest {
=======
public class CalcTest {
	
	double a; 
	double b;
	Calculadora calc = null;

	@Before
	public void setUp() {
		a = 25;
		b = 5;
		calc = new Calculadora();
	}
>>>>>>> cb96dbfcb9c6e14e04719fe76e7643abc702955a
	
	@Test
	public void testSuma() {
		// Arrange
		double resulSuma;
		// Act
		resulSuma = calc.suma(a, b);
		// Test
		assertEquals(30, resulSuma);
	}
	
	@Test
	public void testResta() {
		// Arrange
		double resulResta;
		// Act
		resulResta = calc.resta(a, b);
		// Test
		assertEquals(20, resulResta);
	}	@Test
	
	public void testMultiplica() {
		// Arrange
		double resulMultiplica;
		// Act
		resulMultiplica = calc.multiplica(a, b);
		// Test
		assertEquals(125, resulMultiplica);
	}	
	
	@Test
	public void testDivide() {
		// Arrange
		double resulDivide;
		// Act
		resulDivide = calc.divide(a, b);
		// Test
		assertEquals(5, resulDivide);
	}	
	
	@Test
	public void testRaiz() {
		// Arrange
		double resulRaiz;
		// Act
		resulRaiz = calc.raiz(a);
		// Test
		assertEquals(5, resulRaiz);
	}
}
