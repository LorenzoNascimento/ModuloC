/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.area_para_pintar_da_parede_10;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Area_para_pintar_da_parede_10 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double largura,altura,area,tinta,pintar = 105;
        
        System.out.println("Digite a largura da parede: ");
        largura = teclado.nextDouble();
        System.out.println("Digite a altura da parede: ");
        altura = teclado.nextDouble();
        
        area = largura * altura;
        tinta = pintar / area;
        
        System.out.println("Voce precisara de " + tinta + "baldes de 18 Litros de tinta para pintar uma parede de " + area + " metros quadrados.");
        
        
        
        
        
    }
}
