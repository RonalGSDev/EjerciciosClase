/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Parte3;

import java.util.Scanner;

public class Programa5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el dia: ");
        int dia = sc.nextInt();
        
        System.out.print("Ingrese el mes: ");
        int mes = sc.nextInt();
        
        System.out.print("Ingrese el año: ");
        int anio = sc.nextInt();
        
        boolean bandera=false;
        
        if(dia>0 && anio>0){
            if(mes == 2){
                if(dia<=28){
                    bandera=true;
                }
            }else if(mes==4 || mes==6 || mes==9 || mes==12){
                 if(dia<=30){
                    bandera=true;
                }
            }else{
                 if(dia<=31){
                    bandera=true;
                }
            }
        }
        
        if(bandera){
            System.out.println("La fecha es correcta");
        }else{
            System.out.println("La fecha es incorrecta");
        }
        
        
        
        
        
    }
}
