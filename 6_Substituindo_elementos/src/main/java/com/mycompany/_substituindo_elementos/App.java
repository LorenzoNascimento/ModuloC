package com.mycompany._substituindo_elementos;

import java.util.ArrayList;

/**
 *
 * @author Lorenzo
 */
public class App {

    public static void main(String[] args) {

        ArrayList<String> frutas = new ArrayList<>();

//       Colocando os nomes na lista 
        frutas.add("Maca");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Beterraba");
        frutas.add("Cenoura");

//       Substituir o nome Laranja por Morango
        frutas.set(2, "Morango");

//       Imprimir a lista na tela
        System.out.println("As frutas da lista sao: \n");
        for (String tela : frutas) {
            System.out.println(tela);
        }
    }
}
