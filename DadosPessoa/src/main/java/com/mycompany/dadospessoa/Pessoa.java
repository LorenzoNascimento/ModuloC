package com.mycompany.dadospessoa;

/**
 *
 * @author Lorenzo
 */
public class Pessoa {

    String nome;
    int idade;
    double altura;

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e eu tenho " + altura + " metros de altura");
    }
}
