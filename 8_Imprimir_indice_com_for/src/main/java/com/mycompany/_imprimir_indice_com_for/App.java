package com.mycompany._imprimir_indice_com_for;
import java.util.ArrayList;
/**
 *
 * @author Lorenzo
 */
public class App {

    public static void main(String[] args) {
//        Criando a lista
        ArrayList<String> pais = new ArrayList<>();
        
//       Inserindo o nome dos paises
        pais.add("Inglaterra");
        pais.add("Estados Unidos");
        pais.add("Alemanha");
        pais.add("Russia");
        pais.add("Suica");
        
//        Imprimindo na tela os paises
        for (String tela : pais){
            System.out.println(tela);
        }
    }
}
