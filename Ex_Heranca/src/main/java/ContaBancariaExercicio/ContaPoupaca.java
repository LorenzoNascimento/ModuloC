package ContaBancariaExercicio;

/**
 *
 * @author Lorenzo
 */
public class ContaPoupaca extends ContaBancaria{
    
    private double taixaJuros;
    
    public ContaPoupaca(int numeroConta, double saldo, double taixaJuros) {
        super(numeroConta, saldo);
        this.taixaJuros = taixaJuros;
    }

    public double getTaixaJuros() {
        return taixaJuros;
    }

    public void setTaixaJuros(double taixaJuros) {
        this.taixaJuros = taixaJuros;
    }
    
}
