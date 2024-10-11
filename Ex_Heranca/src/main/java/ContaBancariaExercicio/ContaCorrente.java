package ContaBancariaExercicio;

/**
 *
 * @author Lorenzo
 */
public class ContaCorrente extends ContaBancaria{
    
    private double limite;
    
    public ContaCorrente(int numeroConta, double saldo, double limite) {
        super(numeroConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
}
