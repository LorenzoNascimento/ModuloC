package com.mycompany._uniao_de_duas_listas_sem_duplicatas;

import java.util.HashSet;

/**
 *
 * @author Aluno
 */
public class App {

    public static void main(String[] args) {

//        Criando as duas listas
        HashSet<Integer> numeros1 = new HashSet<>();
        HashSet<Integer> numeros2 = new HashSet<>();

//        Adicionando numeros na lista 1
        numeros1.add(1);
        numeros1.add(2);
        numeros1.add(3);
        numeros1.add(4);
        numeros1.add(5);

//        Adicionando numeros na lista 2
        numeros2.add(5);
        numeros2.add(2);
        numeros2.add(9);
        numeros2.add(8);
        numeros2.add(1);
        
//        Juntando os numeros da lista 2 com os da lista 1
        numeros1.addAll(numeros2);
        
//        Imprimindo os numeros na tela
        for (int tela : numeros1){
            System.out.println(tela);
        }
    }
}
