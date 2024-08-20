/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soma_de_dois_numeros_inteiros_4;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Soma_de_dois_numeros_inteiros_4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int N1,N2,soma;
//        Usuario informando os numeros
        System.out.println("Digite o primeiro numero:");
        N1 = teclado.nextInt();
        System.out.println("Digite o segundo numero:");
        N2 = teclado.nextInt();
        
        soma = N1 + N2;
        
        System.out.println("A soma de " + N1 + " mais " + N2 + " e: " + soma);
        
        
    }
}
