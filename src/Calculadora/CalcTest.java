/**
 * 
 */
package Calculadora;

import static org.junit.Assert.assertEquals;
import org.junit.Test;





//import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Test;




class CalcTest {
	
	@Test
	public void testSuma() {
		// Arrange
		double a = 25;
		double b = 5;
		Calculadora calc = null;
		double resulSuma;
		// Act
		calc = new Calculadora();
		resulSuma = calc.suma(a, b);
		// Test
		assertEquals(30, resulSuma);
	}
	
	@Test
	public void testResta() {
		// Arrange
		double a = 25;
		double b = 5;
		Calculadora calc = null;
		double resulResta;
		// Act
		calc = new Calculadora();
		resulResta = calc.resta(a, b);
		// Test
		assertEquals(20, resulResta);
	}	@Test
	
	public void testMultiplica() {
		// Arrange
		double a = 25;
		double b = 5;
		Calculadora calc = null;
		double resulMultiplica;
		// Act
		calc = new Calculadora();
		resulMultiplica = calc.multiplica(a, b);
		// Test
		assertEquals(125, resulMultiplica);
	}	
	
	@Test
	public void testDivide() {
		// Arrange
		double a = 25;
		double b = 5;
		Calculadora calc = null;
		double resulDivide;
		// Act
		calc = new Calculadora();
		resulDivide = calc.divide(a, b);
		// Test
		assertEquals(5, resulDivide);
	}	
	
	@Test
	public void testRaiz() {
		// Arrange
		double a = 25;
		Calculadora calc = null;
		double resulRaiz;
		// Act
		calc = new Calculadora();
		resulRaiz = calc.raiz(a);
		// Test
		assertEquals(5, resulRaiz);
	}
}
