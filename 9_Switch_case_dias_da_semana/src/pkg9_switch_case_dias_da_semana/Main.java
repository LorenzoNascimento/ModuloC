package pkg9_switch_case_dias_da_semana;

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
            System.out.println("Digite um numero de 1-7 para saber qual dia da semana ele se refere");
            System.out.println("0. Sair");
            opcao = teclado.nextInt(); //captar oque é digitado pelo usuario para interagir com o menu
            switch (opcao) {
                
//                Opções do menu
                case 1:
                    System.out.println("O dia 1 refere-se a Segunda-Feira\n");
                    break;
                    
                case 2:
                    System.out.println("O dia 2 refere-se a Terça-Feira\n");
                    break;
                    
                case 3:
                    System.out.println("O dia 3 refere-se a Quarta-Feira\n");
                    break;
                    
                case 4:
                    System.out.println("O dia 4 refere-se a Quinta-Feira\n");
                    break;
                    
                case 5:
                    System.out.println("O dia 5 refere-se a Sexta-Feira\n");
                    break;
                    
                case 6:
                    System.out.println("O dia 6 refere-se a Sabado\n");
                    break;
                    
                case 7:
                    System.out.println("O dia 7 refere-se a Domingo\n");
                    break;
                default: 
                    System.out.println("Digite um valor valido");
            }
        }while (opcao != 0);
    }

}
