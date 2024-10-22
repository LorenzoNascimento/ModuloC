package EletroDomesticos;

/**
 *
 * @author Lorenzo
 */
public class Geladeira extends Eletrodomestico{
    
    private int temperatura;
    
    public Geladeira(String marca, String modelo, boolean ligado, int temperatura) {
        super(marca, modelo, ligado);
        this.temperatura = temperatura;
        
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
}
