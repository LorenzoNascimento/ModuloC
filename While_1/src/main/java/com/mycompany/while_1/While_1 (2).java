/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.while_1;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class While_1 {

    public static void main(String[] args) {
        
        int n,s=0;
        String resposta;
        Scanner teclado = new Scanner(System.in);
        
        do {
            System.out.println("Digite um numero. ");
            n = teclado.nextInt(); //Salvar o numero digitado pelo usuario
            s += n; //Salvar e somar o que o usuario digitou
            
            System.out.println("Deseja continuar? [S/N]: ");
            resposta = teclado.next(); //Resposta digitada pelo usuario
        } while (resposta.equals("S")); //oque o usuario deve digitar para continuar
        System.out.println("A soma de todos os valores e: " + s);
    }
}
