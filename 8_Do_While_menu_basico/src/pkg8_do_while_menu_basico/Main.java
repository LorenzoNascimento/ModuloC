package pkg8_do_while_menu_basico;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;

//        Menu
        do {
            System.out.println("1. Bom dia!");
            System.out.println("2. Boa tarde!");
            System.out.println("3. Boa noite!");
            System.out.println("4. Sair");
            opcao = teclado.nextInt();
            switch (opcao) {

//               Opções do menu
                case 1:
                    System.out.println("Bom dia!\n");
                    break;

                case 2:
                    System.out.println("Boa tarde!\n");
                    break;

                case 3:
                    System.out.println("Boa noite!\n");
                    break;
                default:
                    System.out.println("Infome um valor valido\n");
            }
        } while (opcao != 4);
    }

}
