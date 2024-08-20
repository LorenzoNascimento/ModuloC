package pkg3_matriz_transposta;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {

        int[][] matriz = { //Matriz
            {6, 7, 1},
            {6, 2, 3},
            {3, 11, 9}
        };
        
        int contrario; //Variavel
        
        contrario = matriz[0][0]; //Alocando variavel a matriz

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                contrario = matriz[i][j];
                System.out.println(contrario);
            }
        }
    }
}
