package EletroDomesticos;

/**
 *
 * @author Lorenzo
 */
public class Microondas extends Eletrodomestico{
    
    private int potencia;
    
    public Microondas(String marca, String modelo, boolean ligado, int potencia) {
        super(marca, modelo, ligado);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
}
