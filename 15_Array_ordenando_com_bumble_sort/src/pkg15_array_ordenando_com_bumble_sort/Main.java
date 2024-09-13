package pkg15_array_ordenando_com_bumble_sort;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {

//        Criar numeros ALEATÓRIOS
        int numeros[] = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
        }

//        ORDENAR os numeros em ordem crescente
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[i] < numeros[j]) {
                    int ordenado = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = ordenado;
                }
            }
        }
        
//        Exibir na tela
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }
    }

}
