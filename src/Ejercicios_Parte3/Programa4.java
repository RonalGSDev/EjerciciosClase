/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicios_Parte3;

import java.util.Scanner;

public class Programa4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int num3 = sc.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("Todos los numeros son iguales");
        } else {
            int mayor, medio, menor;

            if (num1 >= num2 && num1 >= num3) {
                
                mayor = num1;
                medio = Math.max(num2, num3);
                menor = Math.min(num2, num3);
                
            } else if (num2 >= num1 && num2 >= num3) {
                
                mayor = num2;
                medio = Math.max(num1, num3);
                menor = Math.min(num1, num3);
                
            } else {
                
                mayor = num3;
                medio = Math.max(num1, num2);
                menor = Math.min(num1, num2);
                
            }

            System.out.println("Numeros ordenados: " + mayor + ", " + medio + ", " + menor);
            
            sc.close();
        }
    }
}
