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
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float centigrados;
        System.out.print("Ingrese la cantidad de grados centigrados: ");
        centigrados = sc.nextFloat();
        
        float fahrenheit = 32 + (9 * centigrados / 5);
        
        System.out.println("La conversion es: " + fahrenheit);
    }
}
