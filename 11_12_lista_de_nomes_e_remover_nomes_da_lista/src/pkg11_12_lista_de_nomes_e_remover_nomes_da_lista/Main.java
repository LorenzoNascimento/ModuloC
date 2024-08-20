package pkg11_12_lista_de_nomes_e_remover_nomes_da_lista;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>(); //Lista

//        Adicionando nomes a lista
        nomes.add("Lorenzo");
        nomes.add("Gabriel");
        nomes.add("Catherine");
        nomes.add("Sophia");
        nomes.add("Marcos");
        nomes.add("Felipe");

//        Informando os nomes ao usuario
        for (String tela : nomes) {
            System.out.println(tela);
        }
    }

}
