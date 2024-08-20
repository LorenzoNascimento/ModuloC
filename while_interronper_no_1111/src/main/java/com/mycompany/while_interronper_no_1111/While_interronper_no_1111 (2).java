/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.while_interronper_no_1111;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class While_interronper_no_1111 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n,s = 0,opcao = 0;
        
        do {
            System.out.println("Digite 1 para somar os numeros. ");
            System.out.println("Digite 1111 para encerrar. ");
            opcao = teclado.nextInt();
            switch (opcao) {
                
                case 1:
                    System.out.println("Informe o numero. ");
                    n = teclado.nextInt();
                    s += n;
                    break;
                default:
                    System.out.println("Digite um numero valido. ");
            }
        }while (opcao != 1111);
        System.out.println("A soma de todos os numeros é " + s);
        }
}
