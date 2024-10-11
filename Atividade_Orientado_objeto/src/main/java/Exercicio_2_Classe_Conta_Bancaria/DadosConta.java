package Exercicio_2_Classe_Conta_Bancaria;

/**
 *
 * @author Lorenzo
 */
public class DadosConta {

    private String numeroconta;
    private double saldo;
    private String titular;

    public DadosConta(String numeroconta, String titular) {
        this.numeroconta = numeroconta;
        this.saldo = 100.1;
        this.titular = titular;

    }

    public void status() {

        System.out.println("Numero da conta: " + this.getNumeroconta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular());

    }

    public String getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(String numeroconta) {
        this.numeroconta = numeroconta;
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

    public void setSaldo(double s) {
        this.saldo = s;
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
