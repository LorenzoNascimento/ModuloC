/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.medias_5;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Medias_5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        double nota1,nota2,resultado;

//       perguntar ao usuario 
        System.out.println("Digita a primeiar nota:");
        nota1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = teclado.nextDouble();
        
//        calcular a media
        resultado = (nota1 + nota2) /2;

//        mostrar a média
        System.out.println("a média de "+nota1+" e "+nota2+" sera: "+resultado);
    }
}
