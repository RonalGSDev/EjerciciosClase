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
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de numero a promediar: ");
        int num = sc.nextInt();
        double aux, suma=0;
        
        for(int i=1; i<=num; i++){
            System.out.print("Ingrese el valor "+i+": ");
            aux = sc.nextDouble();     
            suma += aux;  
        }
        System.out.println("El promedio es: "+(suma/num));
    }
}
