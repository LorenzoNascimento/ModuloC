package pkg4_switch_menu_opcoes;

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
            System.out.println("Menu de opcoes: \n");
            System.out.println("1. Iniciar");
            System.out.println("2. Configuracoes");
            System.out.println("3. Sair");

            opcao = teclado.nextInt(); //captar teclado do usuario para abrir a opcao
            switch (opcao) {

                case 1:
                    System.out.println("Voce inicio o nada. \n");
                    break;
                case 2:
                    System.out.println("Voce abriu as configuracoes. \n");
                    break;
                default:
                    System.out.println("Valor invalido, digite outro valor. \n");
            }
        } while (opcao != 3);
    }

}
