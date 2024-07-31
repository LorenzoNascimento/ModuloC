/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array_de_10_numeros_aleatorios;

/**
 *
 * @author TI
 */
public class Array_de_10_numeros_aleatorios {

    public static void main(String[] args) {
        
        int numero[] = new int[10];
        
        numero[0] = 43;
        numero[1] = 85;
        numero[2] = 12;
        numero[3] = 48;
        numero[4] = 97;
        numero[5] = 100;
        numero[6] = 25;
        numero[7] = 72;
        numero[8] = 10;
        numero[9] = 2;
        
        int count = 0;
        
        for (int aleatorio : numero) {
            System.out.println(aleatorio);
        }
    }
}
