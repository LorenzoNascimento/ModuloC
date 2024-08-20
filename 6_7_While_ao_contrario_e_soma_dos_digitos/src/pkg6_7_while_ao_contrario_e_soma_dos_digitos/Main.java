package pkg6_7_while_ao_contrario_e_soma_dos_digitos;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcao;
        double numero = 0;

        //Menu
        do {
            System.out.println("1. exibit 20-1");
            System.out.println("2. Somar digitos");
            System.out.println("3. Sair");
            opcao = teclado.nextInt();
            switch (opcao) {

                case 1: //Exibir numeros de 20 a 1
                    while (numero < 1) {
                        for (int i = 20; i > 0; i--) { //colocar na variavel I os numeros de ordem inversa em 20 até 1
                            numero = i;
                            System.out.println(numero); //mostrar na tela
                        }
                    }
                    break;
                case 2: //Somar os digitor até passar de 100

                    double total = 0,
                     soma = 0;

                    while (total <= 100) { //pedir para o usuario digitar até passar de 100
                        System.out.println("Digite numeros até passar de 100 \n");
                        soma = teclado.nextDouble(); 
                        total += soma; //somar em uma variavel
                    }

                    if (total >= 100) { //Verificar se o valor passou de 100
                        System.out.println("O valor total passou de 100");
                    }
                    break;
                default:
                    System.out.println("Informe um valor valido");
            }
        } while (opcao != 3);
    }

}
