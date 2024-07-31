/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.media_de_um_aluno;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Media_de_um_aluno {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String nome;
        double N1,N2,media,pontos;
        
        System.out.println("Qual seu nome?");
        nome = teclado.nextLine();
        
        System.out.println("Digite a primeira nota.");
        N1 = teclado.nextDouble();
        
        System.out.println("Digite a segunda nota.");
        N2 = teclado.nextDouble(); 
        
        media = N1 + N2;
        pontos = media / 2;
        
        if(pontos >= 7){
            System.out.println( nome + ", Parabens voce passou com " + pontos + " pontos.");
        } else {
            System.out.println( nome + ", Voce reprovou com " + pontos + " pontos");
            }
    }
}
