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
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        
        System.out.print("Ingrese la edad: ");
        edad=sc.nextInt();
        
        if(edad>18){
            System.out.println("MAYOR DE EDAD");
        }
        
    }
            
}
