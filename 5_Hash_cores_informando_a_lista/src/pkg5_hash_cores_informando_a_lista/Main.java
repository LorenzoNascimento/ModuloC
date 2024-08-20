package pkg5_hash_cores_informando_a_lista;
import java.util.HashSet;
/**
 *
 * @author Lorenzo
 */
public class Main {
    
    public static void main(String[] args) {
//        Criando a lista
        HashSet<String> cores = new HashSet<>();
        
//        Adicionando as cores a lista
        cores.add("Ciano");
        cores.add("Azul");
        cores.add("Vermelho");
        cores.add("Amarelo");
        cores.add("Marrom");
        
//        Informando a lista na tela
        for (String tela : cores){
            System.out.println(tela);
        }
    }
    
}
