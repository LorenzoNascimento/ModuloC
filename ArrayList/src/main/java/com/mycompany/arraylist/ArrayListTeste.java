package com.mycompany.arraylist;

import java.util.ArrayList;

/**
 *
 * @author Lorenzo
 */
public class ArrayListTeste {

    public static void main(String[] args) {

        //Criando um ArrayList de String
        ArrayList<String> listaDeNomes = new ArrayList<>();

        //Adicionando elementos no Array
        listaDeNomes.add("Lucas");
        listaDeNomes.add("Carlos");
        listaDeNomes.add("Julio");
        listaDeNomes.add("Joao");
        listaDeNomes.add("Caio");
        listaDeNomes.add("Willyam");

        System.out.println("Quarto nome da lista é: " + listaDeNomes.get(4));

        //Removendo nome da lista
        listaDeNomes.remove("Julio");
        
        //Tambem pode ser
        listaDeNomes.remove(1);

        //verificar o tamanho da lista
        System.out.println("Tamanho da lista: " + listaDeNomes.size());

        //Verificar se a lista contem um Elemento
        System.out.println("Existe joao na lista? " + listaDeNomes.contains("Joao"));

        //Emprimindo os elementos do Array na tela
        for (String nome : listaDeNomes) {
            System.out.println(nome);
        }

        //Limpar a lista de nomes
        listaDeNomes.clear();

        //Verificar se a lista de nomes esta vazia
        System.out.println("Lista de nomes esta vazia? " + listaDeNomes.isEmpty());

    }
}