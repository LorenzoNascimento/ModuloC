/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.resultado_da_soma_de_1_a_100;

/**
 *
 * @author TI
 */
public class Resultado_da_soma_de_1_a_100 {

    public static void main(String[] args) {

        
         int soma = 0;
        for (int i = 6; i <= 100; i += 2) {
            
            soma+=i;
            if(i == 100){
            System.out.println(soma);
            }
        }
    }
}
