package hash_verificar_se_esta_vazio_com_nomes_de_cidades;
import java.util.HashSet;
/**
 *
 * @author Lorenzo
 */
public class Hash_verificar_se_esta_vazio_com_nomes_de_cidades {
    
    public static void main(String[] args) {
//        Criando a lista
        HashSet<String> cidades = new HashSet<>();
        
//        Colocando os nomes na lista
        cidades.add("Tramandai");
        cidades.add("Santo Antonio da Patrulha");
        cidades.add("Osorio");
        cidades.add("Porto Alegre");
        
//        Verificando e informando o usuario se a lista esta vazia
        if(cidades.isEmpty()){
            System.out.println("A lista esta vazia");
        }else{
            System.out.println("A lista nao esta vazia");
        }
    }
    
}
