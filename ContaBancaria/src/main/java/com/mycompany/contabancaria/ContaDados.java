package com.mycompany.contabancaria;

/**
 *
 * @author Lorenzo
 */
public class ContaDados {

    public static void main() {
        ContaBancaria conta = new ContaBancaria();
        conta.numeroConta = "19!@#82$!@@3772@93";
        conta.saldo = 1560;
        conta.titular = "Lorenzo";
        conta.apresentar();
        conta.depositar(1100);
        conta.sacar(152);
       
    }
}
