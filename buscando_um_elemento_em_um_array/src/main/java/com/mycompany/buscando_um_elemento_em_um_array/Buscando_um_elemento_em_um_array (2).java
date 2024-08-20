/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buscando_um_elemento_em_um_array;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Buscando_um_elemento_em_um_array {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
            int[] numeros = new int [10]; //Declara e cria um veroe de 10 espaços.
        for (int i = 0; i < numeros.length; i++) { //Loop de for para.
            numeros[i] = (int) (Math.random() * 100) + 1; //Gera numeros aleatorios de 1 - 100.
        }
        
        int usuario = 0;
        
        System.out.println("Digite um numero para verificar se ele foi sorteado");
        usuario = teclado.nextInt(); //Perguntar e salvar na memoria o numero digitado pelo usuario.
        
        for (int numero : numeros) { //Loop para informar se o numero digitado pelo usuario foi sorteado.
            
            if (usuario == numero){ //if e else para informar o usuario se o numero foi ou não encontrado.
                System.out.println("Elemento encontrado.");   
            }else{
                System.out.println("Elemento nao encontrado.");
            }
            }
    }
}
