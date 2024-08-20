package pkg15_hash_para_array;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Lorenzo
 */
public class Main {
    
    public static void main(String[] args) {
//        Criar duas listas
        HashSet<Integer> numero1 = new HashSet<>();
        ArrayList<Integer> numero2 = new ArrayList<>();
        
//        Adicionar numeros a uma lista
        Collections.addAll(numero1, 1,2,3,4,5,6,7,8,9,10);
        
//        Copiar a lista 1 para a alista 2
        numero2.addAll(numero1);
        
//         informar a lista na tela
        for (int tela : numero2) {
            System.out.println(tela);
        }
    }
    
}
