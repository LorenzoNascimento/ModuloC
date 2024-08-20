package pkg1_switch_dias_da_semana;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {

//        Scanner para salvar os valores digitados pelo usuario
        Scanner teclado = new Scanner(System.in);
        int opcao; // variaveis 

// Iniciando o menu        
        do {
//            Informando o usuario do que deve fazer
            System.out.println("Digite o numero de 1 a 7 para saber o dia correspondente");
            System.out.println("9. Sair");

            opcao = teclado.nextInt(); // captar oque é escrito pelo usuario

//            iniciando o menu 
            switch (opcao) {

//                Menus e oque aparecera apos abrir cada menu
                case 1:
                    System.out.println("O primeiro dia da semana e Segunda-feira \n");
                    break;

                case 2:
                    System.out.println("O segundo dia da semana e Terca-feir \n");
                    break;

                case 3:
                    System.out.println("O terceiro dia da semana e Quarta-feira \n");
                    break;

                case 4:
                    System.out.println("O quarto dia da semana e Quinta-feira \n");
                    break;

                case 5:
                    System.out.println("O quinto dia da semana e Sexta-feira \n");
                    break;

                case 6:
                    System.out.println("O sexto dia da semana e Sabado \n");
                    break;

                case 7:
                    System.out.println("O setimo dia da semana e Domingo \n");
                    break;

//                    Aviso para caso o usuario coloque algum numero que nao tem no menu
                default:
                    System.out.println("Opcao invalida, tente colocar um numero valido \n");
            }
        } while (opcao != 9); // opcao para sair do menu

    }

}
