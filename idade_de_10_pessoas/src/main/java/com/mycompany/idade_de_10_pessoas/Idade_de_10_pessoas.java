/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idade_de_10_pessoas;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Idade_de_10_pessoas {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int media = 0 ,maior = 0 ,menor = 0,total = 0;
        int maiorX = 0,menorX = 0,idadeX = 0;
        
        int idades[] = new int[10];
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Informe a " + (i + 1) + " idade.");
            idades[i] = teclado.nextInt();
            
            total = idades[0] + idades[1] + idades[2] + idades[3] + idades[4] + idades[5] + idades[6] + idades[7] + idades[8] + idades[9];
            media = total / 10;
        
            if(idades[i] > 18){
            maiorX++;
            }
            if(idades[i] < 5){
                menorX++;
            }
            if(idades[i] > idadeX){
                idadeX = idades[i];
            }
            
        }
        System.out.println("A media das idades e de " + media + " anos.");
        System.out.println(maiorX + " pessoas tem mais de 18 anos.");
        System.out.println(menorX + " pessoas tem menos de 5 anos.");
        System.out.println("A maior idade informada e " + idadeX);
    }
}
