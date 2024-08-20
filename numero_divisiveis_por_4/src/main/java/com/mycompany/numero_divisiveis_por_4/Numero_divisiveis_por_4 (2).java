/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numero_divisiveis_por_4;

/**
 *
 * @author TI
 */
public class Numero_divisiveis_por_4 {

    public static void main(String[] args) {
        
        for (int i = 30; i > 0; i--) {
            if(i % 4 == 0){
                System.out.println("["+ i + "]");
            }else{
                System.out.println(i);
            }
            
            
        }
        
    }
}
