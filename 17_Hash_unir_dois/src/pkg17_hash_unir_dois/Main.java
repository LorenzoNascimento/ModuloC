package pkg17_hash_unir_dois;
import java.util.HashSet;
/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        
//        Criando listas
        HashSet<String> carros = new HashSet<>();
        HashSet<String> carros2 = new HashSet<>();
        
//        Lista 1
        carros.add("Fusca");
        carros.add("Uno");
        carros.add("Palho");
        carros.add("Fox");
        carros.add("Focus");
        
//        Lista 2
        carros2.add("Kombe");
        carros2.add("Celta");
        carros2.add("Clio");
        carros2.add("Gol");
        carros2.add("Pajero");
        
//        Juntado a lista 1 com a lista 2
        carros2.addAll(carros);
        
//        Exibindo os nomes na tela
        for (String tela : carros2) { 
            System.out.println(tela);
        }
        
    }
    
}
