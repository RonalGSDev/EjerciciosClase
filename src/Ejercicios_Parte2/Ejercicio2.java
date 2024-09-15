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
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        
        System.out.println("La suma de los numeros es: " + (num1+num2));
    }
}
