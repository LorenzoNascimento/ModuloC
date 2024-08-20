/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maior_de_idade;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Maior_de_idade {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int idade;
        
        System.out.println("Qual seu ano de nascimento?");
        idade = teclado.nextInt();
        
        if (idade >= 18){
            System.out.println("Apto para beber.");
        } 
        else if (idade < 18){
        System.out.println("Deve beber nescau.");
    }
        
    }
}
