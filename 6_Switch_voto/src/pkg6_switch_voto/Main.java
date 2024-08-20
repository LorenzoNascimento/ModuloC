package pkg6_switch_voto;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao, idade = 0;

//        Menu
        do {
//            informar as opcoes
            System.out.println("1. Saber se é possivel votar.");
            System.out.println("9. Sair");

            opcao = teclado.nextInt();
            switch (opcao) { // scanear oque o usuario escreve
                case 1:
                    System.out.println("Digite sua idade.");
                    idade = teclado.nextInt();

                    if (idade <= 15) {
                        System.out.println("Nao pode votar \n");
                    } else if (idade >= 16 && idade <= 17) {
                        System.out.println("Opcional \n");
                    } else if (idade >= 18) {
                        System.out.println("Obrigatorio \n");
                    }
                    break;
                default:
                    System.out.println("Informe um valor valido. \n");
            }
        } while (opcao != 9); // sair do menu
    }

}
