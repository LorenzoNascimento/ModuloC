package pkg5_hash_exiba_com_string;
import java.util.Collections;
import java.util.HashSet;
/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
    HashSet<String> algo = new HashSet<>(); //Crair lista
    
    Collections.addAll(algo, "Esta","lista","contem","algumas","palavras"); //Adicionar a lista palavras

    for (String tela : algo){ // Exibir na tela
        System.out.println(tela);
    }
    }
    
}
