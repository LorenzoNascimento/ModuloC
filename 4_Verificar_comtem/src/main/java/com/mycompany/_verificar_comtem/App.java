package com.mycompany._verificar_comtem;

import java.util.ArrayList;

/**
 *
 * @author Lorenzo
 */
public class App {

    public static void main(String[] args) {

//        Criar a lista
        ArrayList<String> cores = new ArrayList<>();

//        colocar as cores na lista
        cores.add("Vermelho");
        cores.add("Verde");
        cores.add("Azul");

//        Verificar se contem amarelo na lista
        if (cores.contains("Amarelo") == true) {
            System.out.println("Tem amarelo na lista!");
        } else {
            System.out.println("Nao tem amarelo na lista.\n");
        }

//        Imprimir os itens da lista
        System.out.println("As cores da lista sao: ");
        for (String cor : cores) {
            System.out.println(cor);
        }
    }
}
