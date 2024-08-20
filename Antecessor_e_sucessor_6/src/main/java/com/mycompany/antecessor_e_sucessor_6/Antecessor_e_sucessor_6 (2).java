/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.antecessor_e_sucessor_6;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Antecessor_e_sucessor_6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int N1,sucessor,antecessor;
        
//        perguntar ao usuario
        System.out.println("Digite um numero");
        N1 = teclado.nextInt();
        
//        calcular
        sucessor = N1 + 1;
        antecessor = N1 - 1;

//        mostrar na tela os resultados
        System.out.println("O sucessor de " + N1 + " e: " + sucessor);
        System.out.println("O antecessor de " + N1 + " e: " + antecessor);
    }
}
