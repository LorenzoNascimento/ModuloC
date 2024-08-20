package pkg4_if_else_maior_de_dois_numeros;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;

        //Menu
        do {
            System.out.println("1. Para saber o maior valor entre dois numeros"); //informando as opcoes do menu
            System.out.println("2. Saber se o numero é positivo, negativo ou zero");
            System.out.println("3. Sair");

            opcao = teclado.nextInt(); //receber as opcoes digitadas pelo usuario
            switch (opcao) {

                case 1:
//                    Pedindo numeros ao usuario
                    System.out.println("Informe o primeiro numero");
                    double n1 = teclado.nextDouble();
                    System.out.println("Informe o segundo numero");
                    double n2 = teclado.nextDouble();

                    if (n1 > n2) { // Comparar para saber qual é maior ou se sao iguais
                        System.out.println("O numero " + n1 + " é maior que o numero " + n2);
                    } else if (n1 < n2) {
                        System.out.println("O numero " + n2 + " é maior que o numero " + n1);
                    } else if (n1 == n2) {
                        System.out.println("O numero " + n1 + " e " + n2 + " são iguais");
                    }
                    break;

                case 2: //verificar se é positivo, negativo ou zero
                    System.out.println("Informe um numero");
                    double N1 = teclado.nextDouble();
                    if (N1 > 0) {
                        System.out.println("O numero é positivo");
                    } else if (N1 < 0) {
                        System.out.println("O numero é negativo");
                    } else {
                        System.out.println("O numero é zero");
                    }
                    break;
                default:
                    System.out.println("Informe um valor valido");
            }
        } while (opcao != 3);
        teclado.close();
    }

}
