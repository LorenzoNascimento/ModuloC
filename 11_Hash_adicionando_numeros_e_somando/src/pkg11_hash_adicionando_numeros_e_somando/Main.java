package pkg11_hash_adicionando_numeros_e_somando;

import java.util.Collections;
import java.util.HashSet;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {

//        Criando lista
        HashSet<Integer> numeros = new HashSet<>();

//        Adicionando os itens na lista        
        Collections.addAll(numeros, 2, 7, 4, 9, 3, 5);
        
//        Mostrando na tela a quantia de itens na lista
        System.out.println("A lista contem " + numeros.size() + " itens");
        
        
    }
}
