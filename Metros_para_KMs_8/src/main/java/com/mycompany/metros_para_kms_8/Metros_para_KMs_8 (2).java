/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metros_para_kms_8;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Metros_para_KMs_8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        float metros,km;
        
        System.out.println("Digite a distancia em metros que deseja passar para KM: ");
            metros = teclado.nextFloat();
            
            km = metros / 1000;
            
            System.out.println("A distancia em KMs ficara: " + km + "KMs");
            
    }
}
