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
public class ejercicio5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double radio;
        System.out.print("Ingrese el valor del radio: ");     
        radio = sc.nextDouble();
        
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);
        
        System.out.println("La longitud es: " + longitud);
        System.out.println("El area es: " + area);
        
    }
}
