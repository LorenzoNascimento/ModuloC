package ContaBancariaExercicio;

/**
 *
 * @author Lorenzo
 */
public class ContaInvestimentos extends ContaBancaria{
    
    private double Investimentos;
    
    public ContaInvestimentos(int numeroConta, double saldo, double Investimentos) {
        super(numeroConta, saldo);
        this.Investimentos = Investimentos;
    }

    public double getInvestimentos() {
        return Investimentos;
    }

    public void setInvestimentos(double Investimentos) {
        this.Investimentos = Investimentos;
    }
    
    
}
