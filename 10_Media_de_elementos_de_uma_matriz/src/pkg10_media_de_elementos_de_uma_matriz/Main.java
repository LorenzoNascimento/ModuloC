package pkg10_media_de_elementos_de_uma_matriz;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);  //Scanner

        double[][] matriz = new double[4][4]; //matriz

//      Variaveis
        double count = 0, soma = 0, media;
        int opcao = 0;

//        Menu
        do {
            System.out.println("1. Media dos valores");
            System.out.println("9. Sair");
            opcao = teclado.nextInt();
            switch (opcao) { //captar a opcao em que o usuario digitar

                case 1:
                    
//                    Colocar os numeros digitados pelo usuario dentro de uma matriz
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.println("Digite os valores para saber a media de todos os valores");
                            matriz[i][j] = teclado.nextDouble();
                            soma += matriz[i][j]; // Fazer a soma do valor total digitado pelo usuario
                            count++; //salvar quantos numeros forao digitados pelo usuario para depois fazer a divisao
                        }
                    }
                    media = soma / count; //fazer a conta do valor total dividido pela quantia de numeros digitados para saber a media
                    System.out.println("A media dos numeros é: " + media); // informar o resultado ao usuario
                    break;
                default:
                    System.out.println("Informe um valor valido."); //avisar caso o usuario nao digite nem uma das opcoes do menu
            }
        } while (opcao != 9); //finalizar menu
    }

}
