package Veiculos;

/**
 *
 * @author Lorenzo
 */
public class Moto extends Veiculo{
    
    private int cilindradas = 1000;
    private int rodas = 2;
    
    public Moto(String marca, String modelo, int ano, int cilindradas, int rodas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
        this.rodas = rodas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    
}
