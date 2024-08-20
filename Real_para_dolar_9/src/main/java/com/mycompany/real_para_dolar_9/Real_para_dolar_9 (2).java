/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.real_para_dolar_9;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Real_para_dolar_9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        double real,dolar;
        System.out.println("Digite quantos Reais voce deseja converter para Dolar: ");
        real = teclado.nextDouble();
        
        dolar = real * 4.45;
        
        System.out.println("Convertendo " + real + "R$ para Dolar, você terá " + dolar + "$");
        
    }
}
