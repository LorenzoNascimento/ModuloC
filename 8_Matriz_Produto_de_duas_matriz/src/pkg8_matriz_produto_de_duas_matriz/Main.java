package pkg8_matriz_produto_de_duas_matriz;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        
        int[][] matriz = { //Matriz 1
            {2, 6},
            {7, 12},};

        int[][] matriz2 = { //Matriz 2
            {7, 9},
            {1, 6},
        };
        int resultado = 0; //variavel
        
        int lista1 = matriz[0][0];
        int lista2 = matriz2[0][0];
        
//        fazer matriz1 vezes matriz2 (NÃO ESTA FUNCIONANDO)
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado= lista1* lista2;
                System.out.println(resultado);
            }
        }
        
    }

}
