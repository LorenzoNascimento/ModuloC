package com.mycompany.contabancaria;
/**
 *
 * @author Lorenzo
 */
public class ContaBancaria {

    String numeroConta;
    double saldo;
    String titular;
    
    public void apresentar() {
            System.out.println("O numero da sua conta é " + numeroConta + ", seu saldo é de " + saldo + "R$ e o nome do titular é " + titular);
    }
    
    public void sacar (double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        }
        System.out.println("O valor do saquue foi  de " + valor);
    }
    
    public void depositar (double valor) {
        saldo += valor;
        System.out.println("O valor do depósito é de " + valor);
    }
}
