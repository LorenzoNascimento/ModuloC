package pkg7_matriz_maior_e_maior_elemento;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {

//        Criando matriz manual
        int[][] matriz = {
            {1, 6, 2, 8},
            {7, 2, 9, 12},
            {12, 8, 1, 21},
            {5, 2, 7, 8}
        };
//        Colocando as variaveis na posicao 0 da matriz
        int maior = matriz[0][0];
        int menor = matriz[0][0];

//        Salvando o maior e menor numero da matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                } else if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
//        Informando ao usuario
        System.out.println("O maior numero é: " + maior);
        System.out.println("O menor numero é: " + menor);
    }

}
