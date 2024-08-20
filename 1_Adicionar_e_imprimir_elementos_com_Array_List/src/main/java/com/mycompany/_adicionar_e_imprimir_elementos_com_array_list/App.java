package com.mycompany._adicionar_e_imprimir_elementos_com_array_list;

import java.util.ArrayList;

/**
 *
 * @author Lorenzo
 */
public class App {

    public static void main(String[] args) {
        
//        Criando ArryaList de String
        ArrayList<String> NomesDeCidades = new ArrayList<>();
        
//        Colocando nomes de cidades no ArrayList
        NomesDeCidades.add("Tramandai");
        NomesDeCidades.add("Osorio");
        NomesDeCidades.add("Santo Antonio da Patrulha");
        NomesDeCidades.add("Viamao");
        NomesDeCidades.add("Novo Hamburgo");
        
//        Imprimindo os nomes na tela
        for (String nome : NomesDeCidades){
            System.out.println(nome);
        }

    }
}
