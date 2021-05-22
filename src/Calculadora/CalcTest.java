package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class CalcTest {
	
	double a; 
	double b; 
	double r;
	Calculadora calc = null;
	
	public static double abs(double numero) {
        return numero > 0 ? numero : -numero;
    }

	@Before
	public void setUp() {
		a = 25;
		b = 5;
		r =  10.5;
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
		double esperado;
		// Act
		resulRaiz = calc.raiz(r);
		esperado = 3,24037034920393;
		// Test
		//assertEquals(3.24037034920393, resulRaiz);
		assertTrue("Pasa Test con margen en el resultado inferior a 0.0001", abs(esperado-resulRaiz) < 0.0001);
		
	}
}
