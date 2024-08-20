/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idade_de_varias_pessoas;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Idade_de_varias_pessoas {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int masculino,masculino2=0, feminino=0,feminino2=0,alto=0,alto2=0,media=0,total=0,jovem=9999,count1 = 0,opcao = 0;
        
        do {
            System.out.println("escolha o sexo da pessoa e digite sua idade. ");
            System.out.println("1. Masculino");
            System.out.println("2. Feminino");
            System.out.println("3. Sair");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite sua idade.");
                    masculino = teclado.nextInt();
                    total += masculino; //media de idade dos homens
                    if(masculino2 <= masculino){
                     masculino2 = masculino;   
                    }
                    count1++; //quantia de homens cadastrados
                    break;
                    
                case 2:
                    System.out.println("Digite sua idade.");
                    feminino = teclado.nextInt();
                    if(feminino <= jovem){ //Mulher mais jovem
                        jovem = feminino; //
                        
                    } if(feminino2 <= feminino){ //idade mais alta
                        feminino2 = feminino; //
                    }
                    break;
                    
                default:
                    System.out.println("Digite um numero valido");
            }
            
        }while (opcao != 3);
       
        //idade mais alta que nao funciona mostra 0
//        if (masculino2 > feminino2) { 
//            masculino2 = alto; //
//        }else {
//            feminino2 = alto;
//        }
        
        
        media = total / count1; //média da idade de homens cadastrados
        
        System.out.println("A idade mais alta é de " + alto + " anos.");
        System.out.println("Foram cadastrados um total de " + count1 + " homens.");
        System.out.println("A mulher mais jovem tem " + jovem + " anos");
        System.out.println("A média de idade entre os homens é de " + media + " anos.");
        System.out.println("masculino: " + masculino2 + "\n feminino: " + feminino2);
            
    }
}