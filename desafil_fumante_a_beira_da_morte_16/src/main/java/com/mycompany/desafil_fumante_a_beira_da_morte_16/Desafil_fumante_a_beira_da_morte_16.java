/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafil_fumante_a_beira_da_morte_16;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Desafil_fumante_a_beira_da_morte_16 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double cigarros,anos,cporano,minutos, horas,dias,diasperdidos;
        
        System.out.println("Quantos cigarros voce fuma por dia? ");
        cigarros = teclado.nextDouble();
        
        System.out.println("Quantos anos voce fuma? ");
        anos = teclado.nextDouble();
        
        cporano = cigarros * 365;
        
        minutos = cporano * 10;
        
        horas = minutos / 60;
        
        dias = horas / 24;
        
        diasperdidos = dias * anos;
        
        System.out.println("Voce perdeu " + diasperdidos + " dias de vida fumandos todos os dias em " + anos + " anos.");
        
    }
}
