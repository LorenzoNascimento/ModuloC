package Carro_3;

/**
 *
 * @author Lorenzo
 */
public class Carro extends Veiculos{
    
    private int numRodas;
    private boolean parabrisa;
    
    public Carro(int numPortas, int numRodas, boolean parabrisa) {
        super(numPortas);
    }

    public int getNumRodas() {
        return numRodas;
    }

    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }

    public boolean getParabrisa() {
        return parabrisa;
    }

    public void setParabrisa(boolean parabrisa) {
        this.parabrisa = parabrisa;
    }
    
}
