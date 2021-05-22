package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class CalcTest {
	
	double a; 
	double b; 
	double r;
	Calculadora calc = null;

	@Before
	public void setUp() {
		a = 25;
		b = 5;
		r = 10.5;
		calc = new Calculadora();
	}
	
	// Metodo que testea la funcion suma de la calculadora
	@Test
	public void testSuma() {
		// Arrange
		double resulSuma;
		// Act
		resulSuma = calc.suma(a, b);
		// Test
		assertEquals(30, resulSuma);
	}

	// Metodo que testea la funcion resta de la calculadora
	@Test
	public void testResta() {
		// Arrange
		double resulResta;
		// Act
		resulResta = calc.resta(a, b);
		// Test
		assertEquals(20, resulResta);
	}

	// Metodo que testea la funcion multiplicacion de la calculadora
	@Test
	public void testMultiplica() {
		// Arrange
		double resulMultiplica;
		// Act
		resulMultiplica = calc.multiplica(a, b);
		// Test
		assertEquals(125, resulMultiplica);
	}	

	// Metodo que testea la funcion division de la calculadora
	@Test
	public void testDivide() {
		// Arrange
		double resulDivide;
		// Act
		resulDivide = calc.divide(a, b);
		// Test
		assertEquals(5, resulDivide);
	}	

	// Metodo que testea la funcion raiz de la calculadora
	@Test
	public void testRaiz() {
		// Arrange
		double resulRaiz;
		// Act
		resulRaiz = calc.raiz_metodo_babilonico(r);
		// Test
		assertEquals(3.24037034920393, resulRaiz);
		
	}
}
