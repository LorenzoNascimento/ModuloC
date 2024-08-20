/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bascara;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Bascara {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double a,b,c,x1,x2,delta;
   
//        Pedindo valorres para os usuarios
        System.out.println("Digite o valor de A.");
        a = teclado.nextDouble();
        
        System.out.println("Digite o valor de B.");
        b = teclado.nextDouble();
        
        System.out.println("Digite o valor de C.");
        c = teclado.nextDouble();

//        Calculando o Delta
        delta = (Math.sqrt(Math.pow(b,2) -4 * a * c));

//        Calculando o X1 e X2
        x1 = ((-b + delta) / 2 * a);
        x2 = ((-b - delta) / 2 * a);

//        Mostrando Resultados
        System.out.println("O resultado de x1 e: " + x1);
        System.out.println("O resultado de x2 e: " + x2);
        
    }
}
