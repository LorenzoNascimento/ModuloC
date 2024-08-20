/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.alistamento_militar;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Alistamento_militar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int idade,nascimento,ano,falta;
        
        System.out.println("Quando voce nasceu?.");
        ano = teclado.nextInt();
        
        nascimento = ano - 2006;
        idade = ano - 2024;
        falta = idade + 18;
        
        if (idade <= -18){
            System.out.println("Voce se alistou em " + falta + " anos");
        } else if (idade > -18 ){
            System.out.println("Voce se alistara em " + falta + " anos");
}
        
    }
}
