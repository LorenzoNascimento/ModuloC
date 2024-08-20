/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soma_de_7_numeros_inteiros;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Soma_de_7_numeros_inteiros {

    public static void main(String[] args) {
        
        int soma = 0;
        for (int i = 1; i <= 7; i++) {
            
            soma += i;
            if(i >= 7){
            System.out.println(soma);
            }
        }
        
    }
}
