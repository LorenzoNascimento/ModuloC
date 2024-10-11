package Exercicio_1_ContaBancaria;

/**
 *
 * @author Lorenzo
 */
public class ContaMain {

    public static void main(String[] args) {

        ContaComandos c = new ContaComandos();

        c.saldo();
        c.depositar();
        c.sacar();
    }
}
