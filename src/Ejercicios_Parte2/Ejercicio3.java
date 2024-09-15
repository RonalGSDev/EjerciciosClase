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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        
        if(num>0){
            System.out.println("El numero es positivo");
        }else if(num<0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numer es neutro");
        }
    }
}
