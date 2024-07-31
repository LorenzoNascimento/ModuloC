/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_1;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Projeto_1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//        String nome;
//        System.out.println("Digite o seu nome");
//        nome = teclado.nextLine();
//        System.out.println("O nome digitado e:" + "\n" + nome);

// Crie um algoritimo que pergunte o nome do aluno, pergunte a
// nota1 e a nota2, calcule a média e mostre o nome do aluno, e soma
// das notas e a média

     
        String nome;
        double N1, N2, soma, resultado;
        
        System.out.println("Digite o nome do aluno em que deseja saber a media.");
        nome = teclado.nextLine();
        
        System.out.println("Digite a primeira nota.");
        N1 = teclado.nextDouble();
        
        System.out.println("Digite a segunda nota.");
        N2 = teclado.nextDouble();
        
        System.out.println(nome);
       
        soma = N1 + N2;
        resultado = soma / 2;
        
        System.out.println("A soma das notas é" + "\n" + soma);
        
        System.out.println("A média das notas do aluno " + nome +" e:" +"\n"+ resultado);
        
    }
}
