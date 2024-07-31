/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contagem_positiva_dita_pelo_usuario;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Contagem_positiva_dita_pelo_usuario {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
     
        int numero;
        
        System.out.println("Digite um numero inteuro para que seja feita a contagem até ele.");
        numero = teclado.nextInt();
        
        for(int i = 1; numero >= i; i++){
            System.out.println(i);
            
            if(i == numero){
                System.out.println("Acabou!");
                
            }
        }
        
    }
}
