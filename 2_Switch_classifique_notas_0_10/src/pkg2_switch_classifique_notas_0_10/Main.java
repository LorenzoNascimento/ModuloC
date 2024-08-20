package pkg2_switch_classifique_notas_0_10;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Scanner
        int opcao; // Variaveis
        double nota = 0;

//        Criando o menu
        do {
            System.out.println("Digite 1 para saber a classificacao de sua nota"); // Informando oque o usuario deve digitar
            System.out.println("9. Sair");

            opcao = teclado.nextInt(); //opcao para captar o teclado do usuario
            switch (opcao) {
//              Menus
                case 1:
                    System.out.println("Informe sua nota");
                    nota = teclado.nextDouble();

//                Saber a nota do usuario A,B,C,D,F
                    if (nota <= 2) {
                        System.out.println("Voce tirou um 'F'");
                    } else if (nota > 2 && nota <= 4) {
                        System.out.println("Voce tirou um 'D'");
                    } else if (nota > 4 && nota <= 6) {
                        System.out.println("Voce tirou um 'C'");
                    } else if (nota > 6 && nota <= 8) {
                        System.out.println("Voce tirou um 'B'");
                    } else if (nota > 8) {
                        System.out.println("Voce tirou um 'A'");
                    }
                    break;
                default: //opcao padrao para avisar que o usuario deve digitar um numero valido caso ele digite um valor nao definido no sistema
                    System.out.println("Informe um valor valido");
            }
        } while (opcao != 9); //fechamento da lista

    }

}
