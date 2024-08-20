package com.mycompany._verificar_duplicados;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
/**
 *
 * @author Lorenzo
 */
public class App {

    public static void main(String[] args) {

//        Criando a lista sem numeros duplicados
    ArrayList<Integer> numeros = new ArrayList<>();
    Collections.addAll(numeros,1,2,3,4,5,6,7,8,2,3);
    
//    Verificar se ha duplicatos
    HashSet<Integer> set = new HashSet<>();
    boolean hashduplicatos = set.size() !* hashduplicatos.size();
    
    
//    Imprimir na tela

        System.out.println("Ha duplicatos " + hashduplicatos);
    }
}
