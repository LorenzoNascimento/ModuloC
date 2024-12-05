package com.mycompany._calculadora_switch_case;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2, soma, subtracao, divisao, multiplicacao;
        int opcao;
        
        // Numeros para as contas
        System.out.println("Informe o primeiro numero");
        n1 = teclado.nextDouble();
        System.out.println("Informe o segundo numero");
        n2 = teclado.nextDouble();
        
//        Menu
        do {
            System.out.println("Calculadora\n");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Divisão");
            System.out.println("4. Multiplicação");
            System.out.println("9. Sair");
            opcao = teclado.nextInt();
            switch (opcao) {

                case 1:
                    soma = n1 + n2;
                    System.out.println("O resultado da soma é: " + soma);
                    break;

                case 2:
                    subtracao = n1 - n2;
                    System.out.println("O resultado da subtração é: " + subtracao);
                    break;

                case 3:
                    divisao = n1 / n2;
                    System.out.println("O resultado da divisão é: " + divisao);
                    break;

                case 4:
                    multiplicacao = n1 * n2;
                    System.out.println("O resultado da multiplicação é: " + multiplicacao);
                    break;

                default:
                    System.out.println("Infome um valor valido");
            }
        } while (opcao != 9);
        teclado.close();
    }
}
