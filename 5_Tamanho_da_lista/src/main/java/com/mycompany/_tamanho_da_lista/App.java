package com.mycompany._tamanho_da_lista;
import java.util.ArrayList;
/**
 *
 * @author Lorenzo
 */
public class App {

    public static void main(String[] args) {
        
//        Criando a lista
        ArrayList<String> caracteres = new ArrayList<>();
        
//        Adicionando as letras
        caracteres.add("A");
        caracteres.add("B");
        caracteres.add("C");
        caracteres.add("D");
        
//        Imprimindo os nomes na tela
        System.out.println("A lista contem " + caracteres.size() + " itens");
        
        
        
    }
}
