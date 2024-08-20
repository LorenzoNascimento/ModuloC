package taboada_matris;

/**
 *
 * @author Lorenzo
 */
public class Taboada_matris {

    public static void main(String[] args) {

        int[][] tabuada = new int[11][11];

        for (int i = 1; i < 11; i++) { //Linha
            for (int j = 1; j < 11; j++) { //Coluna
                tabuada[i][j] = (i) * (j); //Fazer o calculo
            }
        }
        // Imprimir a tabuada
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.println("Tabuada: " + j + " x " + i + ": " + tabuada[i][j]);
            }
            System.out.println();
        }
    }

}
