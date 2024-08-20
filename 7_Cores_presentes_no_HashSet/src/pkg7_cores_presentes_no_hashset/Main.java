package pkg7_cores_presentes_no_hashset;
import java.util.HashSet;
/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        
//        Criando lista
        HashSet<String> cores = new HashSet<>();
        
//        Adicionando itens na lista
        cores.add("Azul");
        cores.add("Ciano");
        cores.add("Vermelho");
        cores.add("Verde");
        cores.add("Marrom");
        
//        Informando se na lista contem vermelho
        if (cores.contains("Vermelho")){
            System.out.println("A lista tem Vermelho");
        }else{
            System.out.println("A lista ~ao tem vermelho");
        }
        
    }
    
}
