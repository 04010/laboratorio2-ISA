/**
 *
 */
package Calculadora;

import java.util.Scanner;

/**
 * @author David
 *
 */
public class Main {

    /**
     * @param args
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException {
        Calculadora c = new Calculadora();
        Scanner input = new Scanner(System.in);
        //boolean mainLoop = true;
        int choice;
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
            switch(choice){
            case 1:
                System.out.println("Introduce el primer operando: ");
                double a = input.nextInt();
                System.out.println("Introduce el segundo operando: ");
                double b = input.nextInt();
                System.out.println("El resultado de " + a + " + " + b + " es: " + c.suma(a,b));
                break;
            case 2:
                System.out.println("Introduce el primer operando: ");
                double d = input.nextInt();
                System.out.println("Introduce el segundo operando: ");
                double e = input.nextInt();
                System.out.println("El resultado de " + d + " - " + e + " es: " + c.resta(d,e));
                break;
            case 3:
               break;
            case 4: 
                break;
            case 5:
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
    }
}    
    
