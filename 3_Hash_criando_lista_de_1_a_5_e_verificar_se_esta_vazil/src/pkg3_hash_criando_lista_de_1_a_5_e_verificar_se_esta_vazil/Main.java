package pkg3_hash_criando_lista_de_1_a_5_e_verificar_se_esta_vazil;
import java.util.Collections;
import java.util.HashSet;
/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
//        Criando lista HashSet
        HashSet<Integer> numeros = new HashSet<>();
        
//        Colocando os numeros na lista
        Collections.addAll(numeros, 1,2,3,4,5);
        
//        Removendo todos os numeros da lista
        numeros.removeAll(numeros);
        
//        Verificando se a lista esta vazia e informando a o usuario
        if(numeros.isEmpty()){
            System.out.println("A lista esta vazia");
        }else{
            System.out.println("Ainda contem numeros na lista");
        }
    }
    
}
