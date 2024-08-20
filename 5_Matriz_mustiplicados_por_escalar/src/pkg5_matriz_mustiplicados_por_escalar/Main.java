package pkg5_matriz_mustiplicados_por_escalar;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor para multiplicar"); // Perguntar ao usuario qual o multiplicador
        int multiplicador = teclado.nextInt(); // Salvar o multiplicador
        
//        Matriz
        int[][] matriz = {
            {2,8,3},  
            {1,21,9},  
            {0,3,7},  
        };
        int soma, total; //Variaveis
        
        soma = matriz[0][0]; // Colocar a matriz a variavel soma
        
//        Somar a matriz em uma variavel
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j];
            }
        }
//        Fazer o calculo do total da matriz com o multiplicador escrito pelo usuario
        total = soma * multiplicador;
        System.out.println(total); // Mostrar na tela
    }

}
