package com.mycompany._remover_duplicatas;
import java.util.HashSet;
/**
 *
 * @author Lorenzo
 */
public class App {

    public static void main(String[] args) {
        
//        Lista que tira as duplicatas
        HashSet<Integer> numeros = new HashSet<>();
        
//        Adicionar numeros a lista
        numeros.add(4);
        numeros.add(9);
        numeros.add(3);
        numeros.add(10);
        numeros.add(1);
        numeros.add(5);
        numeros.add(9);
        numeros.add(5);
        numeros.add(7);
        numeros.add(2);
        numeros.add(8);
        numeros.add(6);
        numeros.add(10);
        numeros.add(3);
        
//        Imprimir os numeros na tela
        for (int tela : numeros){
            System.out.println(tela);
        }
        
    }
}
