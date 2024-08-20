/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.velocidade_do_carro;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Velocidade_do_carro {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int km,preco;
        
        System.out.println("Qual a velocidade do carro? (Km)");
        km = teclado.nextInt();
        if (km > 80 ){
        preco = km * 5;
            System.out.println("Voce foi multado no valor de " + preco + "R$");
        }else {
            System.out.println("Voce nao foi multado.");
        }
        
        
        
        
    }
}
