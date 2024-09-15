/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Parte2;
import java.util.Scanner;
/**
 *
 * @author gomez
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer valor: ");
        int num1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo valor: ");
        int num2 = sc.nextInt();
        
        System.out.print("Ingrese el tercer valor: ");
        int num3 = sc.nextInt();
        
        if (num1 > num2) {
            if (num1 < num3) {
                System.out.println("El numero mediano es el: " + num1);
            } else if (num3 > num2) {
                System.out.println("El numero mediano es el: " + num3);
            } else {
                System.out.println("El numero mediano es el: " + num2);
            }
        } else {
            if (num1 > num3) {
                System.out.println("El numero mediano es el: " + num1);
            } else if (num3 < num2) {
                System.out.println("El numero mediano es el: " + num3);
            } else {
                System.out.println("El numero mediano es el: " + num2);
            }
        }


    }
}
