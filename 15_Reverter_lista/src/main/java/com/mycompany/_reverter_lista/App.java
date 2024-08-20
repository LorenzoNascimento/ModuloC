package com.mycompany._reverter_lista;

import java.util.ArrayList;

/**
 *
 * @author Lorenzo
 */
public class App {

    public static void main(String[] args) {

//      Criando lista para reverter        
        ArrayList<String> palavras = new ArrayList<>();

//       Adicionando as palavras na lista
        palavras.add("Casa");
        palavras.add("Parede");
        palavras.add("Pilar");
        palavras.add("Concreto");
        palavras.add("Janela");

//Revertendo as palavras da lista
        palavras.reversed();

//Imprimindo os itens na tela
        for (String tela : palavras) {
            System.out.println(tela);
        }

    }
}
