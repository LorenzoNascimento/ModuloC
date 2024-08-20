package pkg8_hash_adicionando_cidades_e_removendo;
import java.util.HashSet;
/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        
//        Criando Lista
    HashSet<String> cidades = new HashSet<>();
    
//    Adicionar itens na lista
    cidades.add("Tramandai");
    cidades.add("Sao Paulo");
    cidades.add("Osorio");
    cidades.add("Viamao");
    cidades.add("Novo Hamburgo");
    
//    Remover item da lista
    cidades.remove("Sao Paulo");
    
//    Informar na tela
    for (String tela : cidades){
        System.out.println(tela);
    }
    }
    
}
