/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dobro_e_terca_parte_de_um_numero_7;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Dobro_e_terca_parte_de_um_numero_7 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        float N1,dobro,tercaparte;
//        pedir informações ao usuario
        System.out.println("Digite um numero:");
        N1 = teclado.nextFloat();
//        fazer os calculos
        dobro = N1 * 2;
        tercaparte = N1 / 3;
//        mostrar resultado na tela
        System.out.println("O dobro de " + N1 + " e: " + dobro);
        System.out.println("A terçaparte de " + N1 + " e: " + tercaparte);
        
        
    }
}
