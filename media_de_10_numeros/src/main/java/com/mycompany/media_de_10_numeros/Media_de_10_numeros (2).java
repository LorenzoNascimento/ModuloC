/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.media_de_10_numeros;

/**
 *
 * @author TI
 */
public class Media_de_10_numeros {

    public static void main(String[] args) {
        
        int soma = 0, media = 0;
        int numero[] = new int[10];
        
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 100) + 1;
            
        }
        
        soma = numero[0] + numero[1] + numero[2] + numero[3] + numero[4] + numero[5] + numero[6] + numero[7] + numero[8] + numero[9];
        
        media = soma / 10;
        
        System.out.println(media);
        
    }
}
