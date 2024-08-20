/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.peso_ideal;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Peso_ideal {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double imc,peso,altura;
        
        System.out.println("Digite seu peso(Kg).");
        peso = teclado.nextDouble();
        
        System.out.println("Digite sua altura(m).");
        altura = teclado.nextDouble();
        
        imc = peso / (altura * altura);
        
        if (imc < 17) {
            System.out.println("Peso muito baixo.");
            
        } else if (imc >= 17 && imc <= 18.5){
                System.out.println("Abaixo do peso.");
        } else if (imc >= 18.5 && imc <= 25){
            System.out.println("Peso ideal.");
        } else if (imc >= 25 && imc <= 30){
            System.out.println("Sobrepeso.");
        } else if (imc >= 30 && imc <= 35){
            System.out.println("Obesidade.");
        } else if (imc >= 35 && imc <= 40){
            System.out.println("Obesidade severa.");
        } else if (imc > 40){
            System.out.println("Obesidade morbida.");
        }
        
        System.out.println("o seu imc e: "+imc);
        
    }
}
