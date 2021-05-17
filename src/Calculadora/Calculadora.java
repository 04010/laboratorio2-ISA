/**
 * 
 */
package Calculadora;

/**
 * @author David
 *
 */
public class Calculadora {
	
	public Calculadora() {
	}
	
	public double suma(double a, double b) {
		return a+b;
	}
	
	public double resta(double a, double b) {
		return a-b;
	}
	
	public int multiplica(int a, int b) {
		return a*b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	
	public double raiz(int a) {
            double x = 1.0;
        int k;
        
        for(k = 1; k < 10; k++){
            x = (x + a/x) / 2;
        }
        
		return x;
	}
}
