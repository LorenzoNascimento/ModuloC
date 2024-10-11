package Exercicio_1_ContaBancaria;

/**
 *
 * @author Lorenzo
 */
public class ContaComandos implements ContaInterface {
    
    private double saldo;
    private double depositar;
    private double sacar;
    
    public void ContaComandos(){
        this.saldo = (100);
        this.depositar = 32.60;
        this.sacar = 16.30;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }
    
    @Override
    public void saldo() {
        System.out.println("O saldo da sua conta é de: " + (this.getSaldo() + 100));
    }

    @Override
    public void depositar() {
        saldo += depositar;
        System.out.println("\nVocê depositou: " + (this.getDepositar() + 20.25));
        System.out.println("Seu saldo atual é de: " + (this.getSaldo() + 120.25));
    }

    @Override
    public void sacar() {
        if(this.getSaldo() >= this.getSacar()){
            saldo -= sacar;
            System.out.println("\nVocê sacou: " + (this.getSacar() - 50.25));
            System.out.println("Seu saldo atual é de: " + (this.getSaldo() + 70));
        }
    }

    
}
