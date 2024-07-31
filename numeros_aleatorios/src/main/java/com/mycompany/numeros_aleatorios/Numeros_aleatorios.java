/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeros_aleatorios;

/**
 *
 * @author TI
 */
public class Numeros_aleatorios {

    public static void main(String[] args) {

        int[] numeros = new int [10]; //Declara e cria um veroe de 10 espaços.
        for (int i = 0; i < numeros.length; i++) { //Loop de for para.
            numeros[i] = (int) (Math.random() * 100) + 1; //Gera numeros aleatorios de 1 - 100.
        }
        
        for (int numero : numeros) { //Loop para imprimir cada elemento na tela
            System.out.println(numero + " ");
        }
        
    }
}
