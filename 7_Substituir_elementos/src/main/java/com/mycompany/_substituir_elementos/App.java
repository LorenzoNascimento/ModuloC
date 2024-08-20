package com.mycompany._substituir_elementos;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Lorenzo
 */
public class App {

    public static void main(String[] args) {

//        Criar Lista
        ArrayList<Integer> numeros = new ArrayList<>();

//        Adicionar numeros na lista de forma aleatoria        
        numeros.add(36);
        numeros.add(84);
        numeros.add(1);
        numeros.add(17);
        numeros.add(128);
        numeros.add(64);
        numeros.add(99);
        numeros.add(2);
        numeros.add(78);
        numeros.add(26);

//        Organizar os numeros da lista de forma crescente
        Collections.sort(numeros);

//        Imprimir a lista na tela
        for (int tela : numeros) {
            System.out.println(tela);
        }
    }
}
