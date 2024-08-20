/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idade_e_sexo_de_5_pessoas;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Idade_e_sexo_de_5_pessoas {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int sexo = 0,idade = 0;
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Qual seu sexo? ");
            sexo = teclado.nextInt();
            System.out.println("Qual sua idade? ");
            idade = teclado.nextInt();
        }
        
    }
}
