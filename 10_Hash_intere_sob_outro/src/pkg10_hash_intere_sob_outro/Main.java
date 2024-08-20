package pkg10_hash_intere_sob_outro;
import java.util.HashSet;
/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        
//        Craindo as listas
        HashSet<String> primeiro = new HashSet<>();
        HashSet<String> sobrepor = new HashSet<>();
        
//        Adicionando itens
        primeiro.add("Gato");
        primeiro.add("Rato");
        primeiro.add("Cachorro");
        primeiro.add("Coelho");
        primeiro.add("Cobra");
        primeiro.add("Hamster");
        primeiro.add("Sapo");
        
//        Clonando array //falta terminar
        primeiro.clone();

//        Informando na tela
        for(String tela : sobrepor){
            System.out.println(tela);
        }
        
    }
    
}
