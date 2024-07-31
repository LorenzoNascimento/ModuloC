/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.while_idade_dos_alunos_da_turma;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class While_idade_dos_alunos_da_turma {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int idade,soma=0, count = 0,opcao,media=0;
        
        do {
            System.out.println("Digite 1 para saber a média e quantia de alunos na turma. ");
            System.out.println("Digite 999 para finalizar e saber o resultado");
            opcao = teclado.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite a idade do aluno");
                    idade = teclado.nextInt();
                    soma += idade;
                    count++;
                    media = soma / count;
            }
        }while (opcao != 999);
        
        System.out.println("A turma tem " + count + " alunos com a média de idades de " + media + " anos.");
        
    }
}
