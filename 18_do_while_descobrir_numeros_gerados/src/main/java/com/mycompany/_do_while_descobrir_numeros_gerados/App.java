/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany._do_while_descobrir_numeros_gerados;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[1];
        int jogador = 0;
        int opcao;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1; //Gerar numeros de 1 - 100
        }

        System.out.println("1. Jogar");
        opcao = teclado.nextInt();
        do {
            switch (opcao) {

                case 1:
                    System.out.println("Digite um numero!");
                    jogador = teclado.nextInt();

                    if (numeros[0] >= jogador) {
                        System.out.println("O valor é mais alto! ");
                    }
                    if (numeros[0] <= jogador) {
                        System.out.println("O valor é mais baixo");
                    }
                    if (jogador == numeros[0]){
                        System.out.println("PARABENS!!! Voce acertou o numero.");
                    }
                    break;
                default:
                    System.out.println("Digite um valor valido!");
            }

        } while (jogador != numeros[0]);
    }
}
