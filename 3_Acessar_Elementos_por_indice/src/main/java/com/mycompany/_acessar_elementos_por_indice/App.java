package com.mycompany._acessar_elementos_por_indice;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Lorenzo
 */
public class App {

    public static void main(String[] args) {

//        Criando a lista
        ArrayList<Double> numeros = new ArrayList<>();
        
//        Colocando os numeros na lista
        numeros.add(10.0);
        numeros.add(20.0);
        numeros.add(30.0);
        numeros.add(40.0);
        numeros.add(50.0);
        
//        Mostando o terceiro numero da lista na tela
        System.out.println("O terceiro numero da lista é: " + numeros.get(2));
            
        
        
        
    }
}
