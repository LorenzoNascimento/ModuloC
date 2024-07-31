/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenas_um_array;

/**
 *
 * @author TI
 */
public class Ordenas_um_array {

    public static void main(String[] args) {
        
        int numeros[] = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
        }
        
for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[i] < numeros[j]) {
                int ordenado = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = ordenado;
                
                }
            }
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
            
        }
            
    }
}
