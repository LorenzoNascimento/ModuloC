package pkg10_array_maior_elemento;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeros[] = new int[10];
        int valor = 0;

        for (int i = 0; i < 10; i++) { // Pedir ao usuario 10 numeros
            System.out.println("Informe 10 numeros");
            numeros[i] = teclado.nextInt(); 
            if (numeros[i] > valor) { // Verificar qual é o maior numero
                valor = numeros[i];
            }
        }
        System.out.println("O maior valor do Array é: " + valor); // Informar o usuario sobre qual é o maior numero
    }

}
