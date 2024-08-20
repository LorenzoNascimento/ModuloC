/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.locadora_de_carros_14;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Locadora_de_carros_14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        double km,dia,valorkm,valordia,valorfinal;
        System.out.println("Por quantos dias você ficou com o carro? ");
        dia = teclado.nextDouble();
        
        System.out.println("Quantos KMs você percorreu com o carro? ");
        km = teclado.nextDouble();
        
        valordia = dia * 90;
        valorkm = km * 0.20;
        valorfinal = valordia + valorkm;
        
        System.out.println("Valor de " + dia + "de dias com o carro ficará em: " + valordia + "R$");
        System.out.println("Valor de " + km + "km percorridos ficará em: " + valorkm + "R$");
        System.out.println("O valor total a ser pago ficará em: " + valorfinal);
        
    }
}
