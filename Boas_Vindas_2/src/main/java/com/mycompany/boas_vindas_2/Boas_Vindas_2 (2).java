/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boas_vindas_2;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Boas_Vindas_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        
//       pedindo ao usuario seu nome
        System.out.println("Digite seu nome.");
        nome = teclado.nextLine();
       
//        desejando boas vindas para o noem em que o usuario informou
        System.out.println("Ola " + nome + ", Seja Bem Vindo!");
        
    }
}
