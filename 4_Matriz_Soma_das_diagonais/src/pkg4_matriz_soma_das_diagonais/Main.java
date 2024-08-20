package pkg4_matriz_soma_das_diagonais;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {

        int[][] matriz = { //Matriz
            {2, 0, 6},
            {0, 1, 0},
            {2, 0, 4},};

        int somadireita = 0, somaesquerda = 0; //Variaveis para somar

// Somando as matrizes        
        somadireita = matriz[0][0] + matriz[1][1] + matriz[2][2];
        somaesquerda = matriz[2][0] + matriz[1][1] + matriz[0][2];
        
//        Informando ao usuario
        System.out.println("A soma da matriz da esquerda para a direita e: " + somadireita);
        System.out.println("A soma da matriz da direita para a esquerda e: " + somaesquerda);

    }

}
