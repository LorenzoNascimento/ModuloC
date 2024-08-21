/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany._ordenar_array_com_bubblesort;

/**
 *
 * @author Lorenzo
 */
public class App {

    public static void main(String[] args) {
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) { //Loop para gerar executar o comando 10 vezes
            numeros[i] = (int) (Math.random() * 100) + 1; //Gerar numeros aleatórios de 1 a 100
        }

//        Bubble sor para ordenar os numeros em ordem crescente
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (numeros[i] < numeros[j]) {
                    int ordenado = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = ordenado;
                }
            }
        }

//        Exibir os numeros na tela
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }
    }
}
