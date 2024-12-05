package com.mycompany.monster;

import java.util.Scanner; 

/**
 *
 
@author Lorenzo*/
public class Monster {
    public static Energetico escolherSabor(int escolha) { // Usando Energetico em vez de Monster
        Energetico mangoLouco = new Energetico("Mango louco", 9.80);
        Energetico ultraViolet = new Energetico("Ultra violet", 11.20);
        Energetico absolutelyZero = new Energetico("Absolutely zero", 9.99);
        Energetico original = new Energetico("Original", 8.00);

        Energetico escolhido; // Usando Energetico em vez de Monster

        switch(escolha) {
            case 1:
                escolhido = mangoLouco;
                break;
            case 2:
                escolhido = ultraViolet;
                break;
            case 3:
                escolhido = absolutelyZero;
                break;
            case 4:
                escolhido = original;
                break;
            default:
                System.out.println("Opção inválida.");
                return null;
        }
        return escolhido;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temos Monster dos sabores: \n1=Mango louco\n2=Ultra violet\n3=Absolutely zero\n4=Original");
        System.out.println("Digite o Sabor que você quer com o numero: ");
        int escolha = sc.nextInt();
        Energetico escolhido = escolherSabor(escolha); // Usando Energetico em vez de Monster
        if (escolhido != null) {
            System.out.println("Você escolheu: " + escolhido.getSabor() + "\nValor: R$" + escolhido.getValor());
        }
    }
}