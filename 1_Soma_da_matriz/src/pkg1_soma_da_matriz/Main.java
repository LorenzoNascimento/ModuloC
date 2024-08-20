package pkg1_soma_da_matriz;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {

        int[][] matriz = new int[4][4]; //matriz
        
        for (int i = 1; i < 4; i++) { //Linha
            for (int j = 1; j < 4; j++) { //Coluna
                matriz[i][j] = (i) + (j); //Somar numeros da matriz

            }
        }
//        Imprimir na tela
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                                System.out.println("Soma das matrizes é: " + (i) + (j));

            }
        }
    }

}
