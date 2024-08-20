package pkg9_calcular_imposto_de_renda;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Scanner
        int opcao; //Variaveis
        double salario = 0, pagar = 0;

//        Menu
        do {
            System.out.println("1. Calcular imposto de renda");
            System.out.println("9. Sair");

            opcao = teclado.nextInt(); //Seletor menu
            switch (opcao) {

                case 1:
//                    Calcular Imposto de renda
                    System.out.println("Informe seu salario.");
                    salario = teclado.nextInt();

                    pagar = salario * 0.275; // calculo
                    System.out.println("O valor que voce deve pagar de emposto de renda é de: " + pagar); //informar o valor a ser pago
                    break;
            }
        } while (opcao != 9);
    }

}
