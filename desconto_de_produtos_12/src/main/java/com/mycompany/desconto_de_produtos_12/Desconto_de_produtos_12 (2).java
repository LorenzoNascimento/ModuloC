/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desconto_de_produtos_12;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Desconto_de_produtos_12 {

    public static void main(String[] args) {
        
            Scanner teclado = new Scanner(System.in);
            
            double preco,desconto,valorfinal;
            
            System.out.println("Digite o valor do produto: ");
            preco = teclado.nextDouble();
            
            desconto = 0.05 * preco;
            valorfinal = preco - desconto;
            
            System.out.println("O valor diminuiu em: " + desconto + "R$");
            System.out.println("O valor final do produto com o desconto de 5% aplicado ficara: " + valorfinal + "R$");
            
            
    }
}
