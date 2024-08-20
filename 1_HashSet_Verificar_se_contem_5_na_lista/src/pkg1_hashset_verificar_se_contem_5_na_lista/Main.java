package pkg1_hashset_verificar_se_contem_5_na_lista;
import java.util.Collections;
import java.util.HashSet;
/**
 *
 * @author Lorenzo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Criando lista HashSet
        HashSet<Integer> numero = new HashSet<>();
        
//        Colocando os numeros na lista
        Collections.addAll(numero, 1,2,3,4,5,6,7,8,9,10);
        
//        Verificando se contem o numero 5 na lista
System.out.println("Contem o numero 5 na lista? \n");
        if (numero.contains(5)){
            System.out.println("Contem numero o numero 5 na lista");
        }else {
            System.out.println("Nao contem o numero 5 na lista");
        }
        
    }
    
}
