package DispositivoEletronico_10;

/**
 *
 * @author Lorenzo
 */
public class Tablet extends DispositivoEletronico{
    
    private double preco;
    public Tablet(String marca, String modelo, double preco) {
        super(marca, modelo);
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
