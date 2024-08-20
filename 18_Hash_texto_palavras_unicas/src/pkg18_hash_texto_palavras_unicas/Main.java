package pkg18_hash_texto_palavras_unicas;
import java.util.HashSet;
/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        
//        Lista
        HashSet<String> texto = new HashSet<>();
        
//        Adicionando texto na lista
        texto.add("Texto ");
        texto.add("feito ");
        texto.add("apartir ");
        texto.add("de ");
        texto.add("palavras ");
        texto.add("unicas ");
        
//        Mostrando o texto na tela
        for (String tela : texto) {
            System.out.print(tela);
        }
    }
}
