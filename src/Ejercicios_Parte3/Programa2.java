/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Parte3;

import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        double num =  sc.nextDouble();
        
        if(num>0){
            System.out.println("El numero es positivo");
        }else if(num<0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es neutro");
        }
        
        sc.close();
    }
}
