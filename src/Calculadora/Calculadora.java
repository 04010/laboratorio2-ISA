package Calculadora;

public class Calculadora {
	
	public Calculadora() {
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
	public double raiz(double a) {
            double x = 1.0;
        int k;
        
        for(k = 1; k < 10; k++){
            x = (x + a/x) / 2;
        }
        
		return x;
	}
}
