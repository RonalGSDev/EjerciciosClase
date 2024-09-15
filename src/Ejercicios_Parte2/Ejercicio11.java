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
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = sc.nextLine();
        
        int vocales = 0;
        String cadenaLower = cadena.toLowerCase();
        
        for (int i = 0; i < cadenaLower.length(); i++) {
            char caracter = cadenaLower.charAt(i);
            
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                vocales++;
            }
        }
        
        System.out.println("La cantidad de vocales es: " + vocales);
                
    }
}
