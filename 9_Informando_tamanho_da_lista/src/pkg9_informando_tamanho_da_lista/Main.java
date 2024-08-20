package pkg9_informando_tamanho_da_lista;
import java.util.HashSet;
/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        
//        Criando lista
        HashSet<String> tamanho = new HashSet<>();
        
//        Adicionando letras a lista
        tamanho.add("A");
        tamanho.add("B");
        tamanho.add("C");
        tamanho.add("D");
        tamanho.add("E");
        tamanho.add("F");
        tamanho.add("G");
        tamanho.add("H");
        tamanho.add("I");
        tamanho.add("J");
        tamanho.add("K");
        tamanho.add("L");
        tamanho.add("M");
        tamanho.add("N");
        tamanho.add("O");
        tamanho.add("P");
        
//        Sabendo o tamanho da lista e informando ao usuario
        System.out.println("A lista contem " + tamanho.size() + " itens");
    }
    
}
