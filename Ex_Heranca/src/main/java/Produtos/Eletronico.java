package Produtos;

/**
 *
 * @author Lorenzo
 */
public class Eletronico extends Produtos{
    
    private double voltagem;
    
    public Eletronico(String nome, double preco, double voltagem) {
        super(nome, preco);
        this.voltagem = voltagem;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }
    
}
