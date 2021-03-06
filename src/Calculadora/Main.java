package Calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
    	Calculadora c = new Calculadora();
        Scanner input = new Scanner(System.in);
        //boolean mainLoop = true;
        int choice;
        try {
	        do{
	            System.out.println("Menu calculadora\n");
	            System.out.print("1.) Suma \n");
	            System.out.print("2.) Resta.\n");
	            System.out.print("3.) Multiplicacion.\n");
	            System.out.print("4.) Division.\n");
	            System.out.print("5.) Raiz cuadrada.\n");
	            System.out.print("6.) Salir\n");
	            System.out.print("\nIntroduce la opcion deseada: ");
	            choice = input.nextInt();
	            System.out.print("\nEn caso de utilizar decimales, han de introducirse con ','.\n ");
	            switch(choice){
	            case 1:
	                System.out.println("Introduce el primer operando: ");
	                double a = input.nextDouble();
	                System.out.println("Introduce el segundo operando: ");
	                double b = input.nextDouble();
	                System.out.println("El resultado de " + a + " + " + b + " es: " + c.suma(a,b));
	                break;
	            case 2:
	                System.out.println("Introduce el primer operando: ");
	                double d = input.nextDouble();
	                System.out.println("Introduce el segundo operando: ");
	                double e = input.nextDouble();
	                System.out.println("El resultado de " + d + " - " + e + " es: " + c.resta(d,e));
	                break;
	            case 3:
	                System.out.println("Introduce el primer operando: ");
	                double f = input.nextDouble();
	                System.out.println("Introduce el segundo operando: ");
	                double g = input.nextDouble();
	                System.out.println("El resultado de " + f + " * " + g + " es: " + c.multiplica(f,g));
	                break;
	            case 4:
					System.out.println("Introduce el dividendo: ");
	                double h = input.nextDouble();
	                System.out.println("Introduce el divisor: ");
	                double i = input.nextDouble();
	                System.out.println("El resultado de " + h + " / " + i + " es: " + c.divide(h,i));
	                break;
	            case 5:
	            	System.out.println("Introduce el operando: ");
	            	double x = input.nextDouble();
	            	System.out.println("La raiz de " + x + " es: " + c.raiz(x));
	                break;
	            case 6: 
	                System.out.println("Saliendo de calculadora...\nOK");
	                input.close();
	                System.exit(0);
	                break;
	            default:
	            System.out.println(choice + " no es una opcion valida! Selecciona una opcion del menu.");
	            }
	            System.out.println("Volviendo al menu...");
	            Thread.sleep(3000);
	        }while(choice != 6);
        }catch(Exception e){
        	System.err.println("Parametros invalidos."); 
        	System.out.println("Saliendo de la calculadora.\nOK");
            input.close();
        }
    }
}    
    
