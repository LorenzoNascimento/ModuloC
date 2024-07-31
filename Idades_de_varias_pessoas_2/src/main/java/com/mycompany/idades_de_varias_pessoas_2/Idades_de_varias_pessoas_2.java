/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idades_de_varias_pessoas_2;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Idades_de_varias_pessoas_2 {

//    Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas. 
//    O programa vai perguntar se o usuário quer ou não continuar. No final, mostre:
//      a) O nome da pessoa mais velha
//      b) O nome da mulher mais jovem
//      c) A média de idade do grupo
//      d) Quantos homens tem mais de 30 anos
//      e) Quantas mulheres tem menos de 18 anos
              
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String nomemasculino[] = new String[5];
        String nomefeminino[] = new String[5];
        int idademasculino[] = new int[5];
        int idadefeminino[] = new int[5];
        int count1=0,count2=0,masculino,feminino,menu=0;
        
        do {
            System.out.println("Escolha o sexo da pessoa e digite sua idade.");
            System.out.println("1. para masculino.");
            System.out.println("2. para feminino.");
            System.out.println("3. Sair");
            menu = teclado.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Digite o nome.");
                    nomemasculino[5] = teclado.nextLine();
                    System.out.println("Digite a idade.");
                    idademasculino[5] = teclado.nextInt();
                    break;
                case 2:
                    System.out.println("Digite o nome.");
                    nomefeminino[5] = teclado.nextLine();
                    System.out.println("Digite a idade.");
                    idadefeminino[5] = teclado.nextInt();
                    break;
                default:
                    System.out.println("Digite um valor valido.");
            }
        }while (menu != 3);
        System.out.println(nomemasculino[5] + idademasculino[5]);
    }
}
