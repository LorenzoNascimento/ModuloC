/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eliminando_elementos_duplicados_array;

/**
 *
 * @author TI
 */
public class Eliminando_elementos_duplicados_array {

    public static void main(String[] args) {

        int numero[] = new int[10];
        
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 100) + 1;
            
        }
        
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero.length - 1; j++) {
                if(numero[i] < numero[j]){
                    int ordenado = numero[i];
                    numero[i] = numero[j];
                    numero[j] = ordenado;
                }
            }
        }
        
        for (int i = 0; i < 10; i++) {
            
        System.out.println(numero[i]);
        }
    }
}
