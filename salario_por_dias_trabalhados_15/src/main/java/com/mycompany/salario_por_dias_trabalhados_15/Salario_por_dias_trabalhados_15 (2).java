/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salario_por_dias_trabalhados_15;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Salario_por_dias_trabalhados_15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int dias,salario; 
                
        System.out.println("Quantos dias voce trabalhou no mes? ");
        dias = teclado.nextInt();
        
        salario = dias * 200;
        
        System.out.println("Voce trabalhou por " + dias + " neste mes e ira recener " + salario + "R$");
        
    }
}
