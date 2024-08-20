package pkg3_for_tabuada_5;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        int[][] tabuada = new int[10][10];

        for (int i = 0; i < 10; i++) { //Fazer a tabuada
            for (int j = 0; j < 10; j++) {
                tabuada[i][j] = (i) * (j);
            }

        }
        for (int i = 0; i < 10; i++) { //Imprimir na tela a tabuada
            for (int j = 0; j < 10; j++) {
                System.out.println("Tabuada do 5: " + j + " x " + i + ": " + tabuada[i][j]);
            }
        }
    }

}
