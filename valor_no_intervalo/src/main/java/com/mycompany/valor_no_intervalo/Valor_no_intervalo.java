/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valor_no_intervalo;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Valor_no_intervalo {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int n1,N2;
        
        System.out.println("Digite um numero.");
        n1 = teclado.nextInt();
        
        System.out.println("Digite o segundo numero.");
        N2 = teclado.nextInt();
        
        for (int N1 = n1; N1 <= N2; N1++) {
            System.out.println(N1);
            if (N1 == N2) {
                System.out.println("Acabou!");
//                tentando arrumar estragando
            }else{
                 for (N1 = n1; N2 >= N1; N1) {
            System.out.println(N1);
            if (N2 == N1) {
                System.out.println("Acabou2!");
            }
            }
            }
        }
        
    }
}
