/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quantos_pares_e_impares;

/**
 *
 * @author TI
 */
public class Quantos_pares_e_impares {

    public static void main(String[] args) {
        int par=0,impar=0;
        
        for (int i = 0; i < 6; i++) {
            
            if(i % 2 == 0){
                par++;
            }else{
                impar++;
            }
        }
        System.out.println("Ha " + par + " numeros pares.");
        System.out.println("Ha " + impar + " numeros impares.");
    }
}
