package com.mycompany._intercessao_de_duas_linhas;

import java.util.ArrayList;

/**
 *
 * @author Lorenzo
 */
public class App {

    public static void main(String[] args) {

//        Criando lista de nomes
        ArrayList<String> nomes1 = new ArrayList<>();
        ArrayList<String> nomes2 = new ArrayList<>();

//        Colocando os nomes na lista 1
        nomes1.add("Ramon");
        nomes1.add("Deivid");
        nomes1.add("Jean");
        nomes1.add("Eduardo");
        nomes1.add("Joao");

//        Colocando os nomes na lista 2
        nomes2.add("Estefany");
        nomes2.add("Estela");
        nomes2.add("Yasmin");
        nomes2.add("Emilly");
        nomes2.add("Helena");
        
//        Imprimindo os nomes na tela de forma intercalada da lista 1

        System.out.println(nomes1.get(0));
        System.out.println(nomes1.get(2));
        
//        Imprimindo os nomes na tela da forma intercalada da lista 2
        System.out.println(nomes2.get(0));
        System.out.println(nomes2.get(2));


    }
}
