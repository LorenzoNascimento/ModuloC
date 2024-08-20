package pkg3_data_de_inicio_das_estacoes_do_ano;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
//        Variaveis e Scanner
        Scanner teclado = new Scanner(System.in);
        int opcao;

//        Incio do menu
        do {

//            Informar ao usuario opcoes do menu
            System.out.println("Digite o valor de cada estacao para saber qual mes ela inicia. \n");
            System.out.println("1. Verao. ");
            System.out.println("2. Outono.");
            System.out.println("3. Inverno.");
            System.out.println("4. Primavera.");
            System.out.println("0. Sair");

            opcao = teclado.nextInt(); //captar oque foi escrito pelo usuario
            switch (opcao) {
                case 1:
                    System.out.println("O verao inicia em Dezembro \n");
                    break;

                case 2:
                    System.out.println("O outono inicia em Marco \n");
                    break;

                case 3:
                    System.out.println("O inverno inicia em Junho \n");
                    break;

                case 4:
                    System.out.println("A primavera inicia em Setembro \n");
                    break;

                default:
                    System.out.println("Informe um valor valido \n");
            }
        } while (opcao != 0); //fechar menu
    }

}
