package EncapsulamentoConta_13;

/**
 *
 * @author Lorenzo
 */
public class ContaCorrente {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaCorrente(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void Depositar(double valor) {
        if (saldo > 0) {
            this.saldo += valor;
            System.out.println("Deposito de " + valor + " realizado com sucesso." + "\nSeu novo saldo é de: " + saldo);
        } else {
            System.out.println("Valor invalido");
        }
    }
}
