/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.preco_de_produto;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Preco_de_produto {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int preco = 0,caro = 0,barato = 999999999;
        
            for (int i = 0; i < 8; i++) {
            
                System.out.println("Digite o preco ");
                preco = teclado.nextInt();
                
                if(preco > caro){
                    caro = preco;
                }
                if(preco < barato){
                    barato = preco;
                }
        }
        System.out.println("O maior preco e: " + caro + "R$");
        System.out.println("O maior preco e: " + barato + "R$");
        
    }
}
