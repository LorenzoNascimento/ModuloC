package pkg6_somar_linha_e_coluna_da_matriz;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {

//        Matriz
        int[][] matriz = {
            {2,8,4},
            {0,1,9},
            {5,7,12},
        };

//        Colocar os numeros da matriz na variavel soma
        int soma = matriz[0][0];
        
// Somar a matriz na variavel soma       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j];
            }
        }
        
//        Imprimir na tela
        System.out.println(soma);
    }

}
