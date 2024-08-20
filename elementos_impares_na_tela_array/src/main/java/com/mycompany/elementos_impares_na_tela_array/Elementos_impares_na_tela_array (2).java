/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.elementos_impares_na_tela_array;

/**
 *
 * @author TI
 */
public class Elementos_impares_na_tela_array {

    public static void main(String[] args) {
        
        int par = 0,impar = 0;
        
        int numero[] = new int[10];
        
        for (int i = 0; i < numero.length; i++) { //gerar 10 numeros aleatorios de 1 - 100.
            numero[i] = (int) (Math.random() * 100) + 1;
            
            if(numero[i] % 2 == 0){ //verificar se o numero é impar ou par.
                par++;
            }else{
                impar++;
            }  
        }
        
        System.out.println("Teve " + par + " numeros pares."); //informar quantia de numeros impares.
        System.out.println("Teve " + impar + " numeros impares."); 
        
    }
}
