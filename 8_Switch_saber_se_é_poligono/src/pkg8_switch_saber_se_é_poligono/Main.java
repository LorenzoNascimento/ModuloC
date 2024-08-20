package pkg8_switch_saber_se_é_poligono;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao, lados = 0;

//        Menu
        do {
            System.out.println("1. Para saber qual sua figura geometrica.");
            System.out.println("9. Sair.");

            opcao = teclado.nextInt(); // Scanner do que o usuario escreve
            switch (opcao) {
                case 1:

                    System.out.println("Informe a quantia de lados da figura geometrica: \n");
                    lados = teclado.nextInt(); // informar quantia de lados

// saber qual a figura geometrica                    
                    if (lados == 3) {
                        System.out.println("Triangulo");
                    } else if (lados == 4) {
                        System.out.println("Quadrado");
                    } else if (lados == 5) {
                        System.out.println("Pentagono");
                    } else if (lados == 6) {
                        System.out.println("Hexagono");
                    } else if (lados == 7) {
                        System.out.println("Heptagono");
                    } else if (lados == 8) {
                        System.out.println("Octagono");
                    } else if (lados == 9) {
                        System.out.println("Eneagono");
                    } else if (lados == 10) {
                        System.out.println("Decagono");
                    } else if (lados == 11) {
                        System.out.println("Undecagono");
                    } else if (lados == 12) {
                        System.out.println("Dodecagono");
                    } else if (lados == 15) {
                        System.out.println("Pentagono");
                    } else if (lados == 20) {
                        System.out.println("Icosagono");
                    }
                    break;
                default:
                    System.out.println("Digite um valor valido"); //informar o usuario caso o valor digitado nao seja valido
            }
        } while (opcao != 9); //fechar o menu
    }

}
