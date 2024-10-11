package com.mycompany.caneta;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class CanetaClass {

    public String marca;
    public String cor;
    public String ponta;
    public int carga;
    boolean esta_tampada;

    public void estado_atual() {
        System.out.println("#Informações da caneta#");
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ela está tampada? " + (this.esta_tampada ? "Sim" : "Não"));
    }

    public void escrever() {
        if (this.esta_tampada == true) {
            System.out.println("Está tampada! Não posso escrever!");
        } else {
            System.out.println("Está destampada! Posso escrever!");
        }
    }

    public void tampar() {
        this.esta_tampada = true;
    }

    public void destampar() {
        this.esta_tampada = false;
    }

    public boolean perguntarTampada() {
        Scanner teclado2 = new Scanner(System.in);

        System.out.println("A caneta está tampada? Sim ou Não");
        String resposta = teclado2.nextLine().toLowerCase();

        if (resposta.equals("sim")) {
            return true;

        } else if (resposta.equals("não") || resposta.equals("nao")) {
            return false;

        } else {
            System.out.println("Resposta Invalida. Por favor, digite 'Sim' ou 'Não'");
            return perguntarTampada();
        }
    }
}
