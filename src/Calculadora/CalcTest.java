/**
 * 
 */
package Calculadora;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalcTest {

	public void test() {
		// Arrange
		double a = 25;
		double b = 5;
		Calculadora calc = null;
		double resulSuma;
		double resulResta;
		double resulMultiplica;
		double resulDivide;
		double resulRaiz;
		// Act
		calc = new Calculadora();
		resulSuma = calc.suma(a, b);
		resulResta = calc.resta(a, b);
		resulMultiplica = calc.multiplica(a, b);
		resulDivide = calc.divide(a, b);
		resulRaiz = calc.raiz(a);
		// Test
		assertEquals(30, resulSuma);
		assertEquals(20, resulResta);
		assertEquals(125, resulMultiplica);
		assertEquals(5, resulDivide);
		assertEquals(5, resulRaiz);
	}

}
