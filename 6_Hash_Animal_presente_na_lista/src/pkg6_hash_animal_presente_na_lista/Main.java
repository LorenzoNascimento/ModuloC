package pkg6_hash_animal_presente_na_lista;
import java.util.HashSet;
/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        
//        Criando lista
    HashSet<String> animais = new HashSet<>();
    
//    Adicionando itens ha lista
    animais.add("Galinha");
    animais.add("Vaca");
    animais.add("Boi");
    animais.add("Cavalo");
    animais.add("Porco");
    
//    Vendo se tem porco na lista e informando o usuarios
        if (animais.contains("Porco")) {
            System.out.println("A lista contem Porco");
        }else {
            System.out.println("A lista nao contem Porco");
        }
    
    }
    
}
