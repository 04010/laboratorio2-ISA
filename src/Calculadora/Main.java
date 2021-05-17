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
     */
    public static void main(String[] args) {
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
                System.out.println("Introduce el primer operando:\n");
                double a = input.nextInt();
                System.out.println("Introduce el segundo operando:\n");
                double b = input.nextInt();
                c.suma(a,b);
                break;
            case 2:                
                break;
            case 3:
               break;
            case 4: 
                break;
            case 5:
                break;
            case 6: 
                System.out.println("Saliendo de calculadora...\n");
                System.exit(0);
                break;
            default:
            System.out.println(choice + " no es una opcion valida! Selecciona una opcion del menu.");
            }
        }while(choice != 6);    
    }
}    
    
