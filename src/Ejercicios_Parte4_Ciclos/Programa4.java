/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Parte4_Ciclos;

public class Programa4 {
    public static void main(String[] args) {
        int cont = 1, i;
        
        while(cont<=10){
            
            System.out.println("Tabla del "+cont);
            i=1;
            while(i<=10 ){
                System.out.println(cont+" * "+ i + " = " +(cont*i));
                i++;
            }
            
            cont++;
            
            System.out.println();
        }
        
        
    }
}
