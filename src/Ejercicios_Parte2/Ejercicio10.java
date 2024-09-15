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
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, mayor=0;
        for(int i=1; i<=10; i++){
            System.out.print("Ingrese el valor "+i+": ");
            num = sc.nextInt();
            
            if(i>1){
                if(num>mayor){
                    mayor=num;
                }
            }else{
                mayor=num;
            }
        }
        
        System.out.println("El numero mayor es: "+mayor);
    }
}
