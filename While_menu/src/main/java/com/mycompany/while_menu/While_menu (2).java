/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.while_menu;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class While_menu {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int opcao;
        
        do {
            System.out.println("1. Opcao 1");
            System.out.println("2. Opcao 2");
            System.out.println("3. Sair");
            System.out.println("Digite sua Opcao.");
            opcao = teclado.nextInt();
            switch(opcao) {
                case 1:
                    System.out.println("Voce escolheu a Opcao 1.");
                    break;
                case 2:
                    System.out.println("Voce escolheu a Opcao 2.");
                    break;
                case 3:
                    System.out.println("Saindo do menu.");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }while (opcao != 3);
        
    }
}
