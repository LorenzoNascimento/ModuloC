package pkg5_calculadora_menu_simples;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor1 = 0, valor2 = 0, soma = 0, subtracao = 0, multiplicacao = 0, divisao = 0;
        int opcao;

        System.out.println("Calculadora: \n");
        System.out.println("Digite o valor 1");
        valor1 = teclado.nextInt();
        System.out.println("Digite o valor 2");
        valor2 = teclado.nextInt();

        do {

            System.out.println("1. Soma");
            System.out.println("2. Subtracao");
            System.out.println("3. Multiplicacao");
            System.out.println("4. Divisao");
            System.out.println("9. Sair");

            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    soma = valor1 + valor2;
                    System.out.println("O resultado da soma é: " + soma);
                    break;

                case 2:
                    subtracao = valor1 - valor2;
                    System.out.println("O resultado da subtracao é: " + subtracao);
                    break;

                case 3:
                    multiplicacao = valor1 * valor2;
                    System.out.println("O resultado da multiplicacao é: " + multiplicacao);
                    break;

                case 4:
                    divisao = valor1 / valor2;
                    System.out.println("O resultado da divisao é: " + divisao);
                    break;

                default:
                    System.out.println("Tente um valor valido.");
            }
        } while (opcao != 9);
    }

}
