/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idade_para_votar;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Idade_para_votar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int ano,idade,nascimento;
        
        System.out.println("Digite seu ano de nascimento. (YYYY)");
        ano = teclado.nextInt();
        
        nascimento  = ano - 2006;
        idade = ano - 2024;
        
        if(ano <= 2006){
            System.out.println("Voce pode votar." + "\nVoce tem " + idade + " anos.");
        } else {
            System.out.println("Voce nao pode votar. " + "\nVoce tem " + idade + " anos.");
        }
        
        
        
    }
}
