package pkg2_hashset_removendo_fruta_especifica;
import java.util.HashSet;
/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
//        Criando lista HashSet
        HashSet<String> frutas = new HashSet <>();
        
//        Adicionando as frutas na lista
        frutas.add("banana");
        frutas.add("Maca");
        frutas.add("Cereja");
        frutas.add("Pera");
        frutas.add("Cenoura");
        frutas.add("Batata");
        
//        Removendo a pera da lista
        frutas.remove("Pera");
        
//        Mostrando na tela as frutas restantes
        for(String tela : frutas){
            System.out.println(tela);
        }
    }
    
}
