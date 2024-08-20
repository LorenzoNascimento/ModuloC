package pkg14_hash_string_nome_de_paises;
import java.util.HashSet;
/**
 *
 * @author Lorenzo
 */
public class Main {
    
    public static void main(String[] args) {
        
//        Lista 1
        HashSet<String> paises = new HashSet<>();

//        lista 2
        HashSet<String> paisescopy = new HashSet<>();
        
//        Adicionando a lista 1 
        paises.add("Brasil");
        paises.add("Estados Unidos");
        paises.add("Russia");
        paises.add("Ucrania");
        paises.add("China");
        paises.add("Alemanha");
        
//        Adicionando a lista 2
        paisescopy.add("Brasil");
        paisescopy.add("Estados Unidos");
        paisescopy.add("Russia");
        paisescopy.add("Ucrania");
        paisescopy.add("China");
        paisescopy.add("Alemanha");
        
//        Copiando da lista 1 para a lista 2 e avisando o usuario se a lista 2 contem todos os itens da lista 1
        if (paisescopy.containsAll(paises)){
            System.out.println("A lista 2 contem todos os paises da lista 1 \n");
        }else {
            System.out.println("A lista 2 nao contem todos os paises da lista 1 \n");
        }
        
//        Informanto ao usuario a lista
        for(String tela : paisescopy){
            System.out.println(tela);
        }
    }
    
}
