package pkg12_array_list_remover_nomes_da_lista;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        Collections.addAll(numeros, 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        
        for (int numeros2 : numeros){
            if (numeros2 % 2 == 0){
                System.out.println(numeros2);
            }else {
                numeros.remove(numeros);
            }
        }
    }
}

