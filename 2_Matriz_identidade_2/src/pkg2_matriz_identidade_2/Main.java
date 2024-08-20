package pkg2_matriz_identidade_2;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {

        int[][] matriz = { // Matriz
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1},};

        boolean identidade = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (i == j && matriz[i][j] != 1) {
                    identidade = false;
                } else if (i != j && matriz[i][j] != 0) {
                    identidade = false;
                }
            }
        }

        if (identidade) {
            System.out.println("A matriz e uma matriz identidade");
        } else {
            System.out.println("A matriz nao e uma matriz identidade");
        }
    }

}
