package pkg13_metodos_calculadora;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static double Soma(double n1, double n2) {
        double soma = 0;
        soma = n1 + n2;
        return soma;
    }

    public static double Subtracao(double n1, double n2) {
        double subtracao = 0;
        subtracao = n1 - n2;
        return subtracao;
    }

    public static double Divisao(double n1, double n2) {
        double divisao = 0;
        divisao = n1 / n2;
        return divisao;
    }

    public static double Multiplicacao(double n1, double n2) {
        double multiplicacao = 0;
        multiplicacao = n1 * n2;
        return multiplicacao;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2;
        int opcao;

        System.out.println("Informe o valor 1");
        n1 = teclado.nextDouble();
        System.out.println("Informe o valor 2");
        n2 = teclado.nextDouble();

        do {
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Divisão");
            System.out.println("4. Multiplicação");
            System.out.println("9. Sair");
            opcao = teclado.nextInt();
            switch (opcao) {

                case 1:
                    System.out.println("A soma dos valores é: " + Soma(n1, n2));
                    break;
                case 2:
                    System.out.println("A subtração dos valores é: " + Subtracao(n1, n2));
                    break;
                case 3:
                    System.out.println("A Divisão dos valores é: " + Divisao(n1, n2));
                    break;
                case 4:
                    System.out.println("A multiplicação dos valores é: " + Multiplicacao(n1, n2));
                    break;
                default:
                    System.out.println("Insira um valor valido");
            }

        } while (opcao != 9);
    }

}
