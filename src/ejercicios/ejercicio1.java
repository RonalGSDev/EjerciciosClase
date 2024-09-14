package ejercicios;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;
        System.out.print("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
        
        System.out.println("El primer numero ingresado es: " + num1);
        System.out.println("El segundo numero ingresado es: " + num2);
        
    }
}
