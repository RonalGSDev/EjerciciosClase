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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer valor: ");
        int num1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo valor: ");
        int num2 = sc.nextInt();
        
        System.out.print("Ingrese el tercer valor: ");
        int num3 = sc.nextInt();
        
        if(num1>num2 && num1>num3){
            System.out.println("El numero mayor es el: "+ num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("El numero mayor es el: "+ num2);
        }else if(num3>num1 && num3>num1){
            System.out.println("El numero mayor es el: "+ num3);
        }
    }
}
