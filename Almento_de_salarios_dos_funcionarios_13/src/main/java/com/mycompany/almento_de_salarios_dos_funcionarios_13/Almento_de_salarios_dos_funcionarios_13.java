/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.almento_de_salarios_dos_funcionarios_13;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Almento_de_salarios_dos_funcionarios_13 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double salario,almento,salariototal;
                
        System.out.println("Digite o valor do salario: ");
        salario = teclado.nextDouble();
        
        almento = salario / 6.66;
        salariototal = salario + almento;
        
        System.out.println("O almento será de: " + almento);
        System.out.println("O seu salario final ficou em: " + salariototal);
        
    }
}
