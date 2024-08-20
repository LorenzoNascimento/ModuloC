package pkg13_hash_inteiros1_10_e_5_15;
import java.util.Collections;
import java.util.HashSet;
/**
 *
 * @author Lorenzo
 */
public class Main {
    
    public static void main(String[] args) {
        
//        Criando as listas
        HashSet<Integer>numero = new HashSet<>();
        HashSet<Integer>numero2 = new HashSet<>();
        
//        Criando a lista 1
        Collections.addAll(numero, 1,2,3,4,5,6,7,8,9,10);
        
//        Criando a lista 2
        Collections.addAll(numero2, 5,6,7,8,9,10,11,12,13,14,15);
        
//        Adicionando os itens da lista 1 na lista 2
        numero2.addAll(numero);
        
//        Mostrando a lista na tela
        for (int tela : numero2){
            System.out.println(tela);
        }
    }
    
}
