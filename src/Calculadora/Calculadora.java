package Calculadora;

public class Calculadora {
	
	public Calculadora() {
	}
	//metodo para devolver el valor absoluto de un numero
	public static double abs(double numero) {
        return numero > 0 ? numero : -numero;
    }
	//metodo para suma dos numeros
	public double suma(double a, double b) {
		return a+b;
	}
	//metodo para restar dos numeros
	public double resta(double a, double b) {
		return a-b;
	}
	//metodo para multiplicar dos numeros
	public double multiplica(double a, double b) {
		return a*b;
	}
	//metodo para dividir dos numeros
	public double divide(double a, double b) {
		return a/b;
	}
	//metodo para obtener raiz cuadrada de dos numeros
	public double raiz(double a){
		double x = 2.0;
        double cociente = divide(a, x);
        double promedio = suma(x, cociente) / 2.0;
        if (a < 0) {
            System.out.println("no se puede calcular raiz cuadrada de numeros negativos");
            return -1;
        } else if (a == 0) {
            return 0;
        } else {
            while (abs(resta(cociente, promedio))>0.00001) {
                x = promedio;
                cociente = divide(a, x);
                promedio = suma(x, cociente)/2.0;
            }
        }
        return promedio;
	}
}
