/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nome_e_salarios_de_funcionarios_3;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Nome_e_salarios_de_funcionarios_3 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String nome;
        int salario;
//      pedir as informações
        System.out.println("Digite o nome.");
        nome = teclado.nextLine();
        
        System.out.println("Digite o salario.");
        salario = teclado.nextInt();
        
//        mostrar na tela as informações
        System.out.println("O nome e: " + nome);
        System.out.println("O salarios e: " + salario);
    }
}
