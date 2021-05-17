/**
 * 
 */
package Calculadora;

/**
 * @author David
 *
 */
public class Calculadora {
	private int op1;
	private int op2;
	
	public Calculadora(int o1, int o2) {
		op1 = o1;
		op2 = o2;
	}
	
	public int suma(int a, int b) {
		return a+b;
	}
	
	public int resta(int a, int b) {
		return a-b;
	}
	
	public int multiplica(int a, int b) {
		return a*b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	
	public int raiz(int a) {
		return a;
	}
}
