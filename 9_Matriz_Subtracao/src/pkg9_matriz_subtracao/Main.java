package pkg9_matriz_subtracao;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {

        int[][] matriz1 = {
            {7, 2, 1},
            {2, 3, 9},
            {7, 9, 62}
        };
        
        int[][] matriz2 = {
            {4, 2, 4},
            {6, 2, 6},
            {8, 4, 8},
        };
        int lista1 = matriz1[0][0];
        int lista2 = matriz2[0][0];
        int total = 0;
        int count = 0;
                
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                total = lista1 - lista2;
         System.out.println(total);
            }
        }
        
    }

}
