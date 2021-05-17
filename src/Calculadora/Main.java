/**
 * 
 */
package Calculadora;

/**
 * @author David
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculadora c = new Calculadora();

		System.out.println("25 + 5 = " + c.suma(25, 5));
		System.out.println("25 - 5 = " + c.resta(25, 5));
		System.out.println("25 x 5 = " + c.multiplica(25, 5));
		System.out.println("25 / 5 = " + c.divide(25, 5));
		System.out.println("Raiz de 25 = " + c.raiz(25));

	}

}
