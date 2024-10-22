package EletroDomesticos;

/**
 *
 * @author Lorenzo
 */
public class Televisao extends Eletrodomestico{
    
            private String canal;
            private int volume;
    
    public Televisao(String marca, String modelo, boolean ligado, String canal, int volume) {
        super(marca, modelo, ligado);
        this.canal = canal;
        this.volume = volume;
        
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
}
