/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contagem_for_5;

/**
 *
 * @author TI
 */
public class Contagem_for_5 {

    public static void main(String[] args) {
        
        for(int i = 100; i >= 0; i -= 5){
            System.out.println(i);
            if(i == 0){
                System.out.println("Acabou");
            }
        }
        
    }
}
