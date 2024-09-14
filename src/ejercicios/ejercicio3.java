/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class ejercicio3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int num;
        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();
        
        System.out.println("El doble de " +num+ " es: " + (num*2));
        System.out.println("El triple de " +num+ " es: " + (num*3));
    }
    
}
