package ContaPoupanca_9;

/**
 *
 * @author Lorenzo
 */
public class ContaPoupanca extends ContaBancaria {

    private double rendimento;
    private double quantiaRendida;

    public ContaPoupanca(String titular, String numeroConta, double saldo) {
        super(titular, numeroConta, saldo);
        this.rendimento = rendimento;
        this.quantiaRendida = quantiaRendida;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public void renda(double rendimento) {
        if (rendimento > 0) {
            quantiaRendida = saldo * rendimento;
            System.out.println("Neste mes sua poupança rendeu: " + quantiaRendida);
        }
    }
}
