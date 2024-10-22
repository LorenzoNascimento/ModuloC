package EletroDomesticos;

/**
 *
 * @author Lorenzo
 */
public class Eletrodomestico {
    
    protected String marca;
    protected String modelo;
    protected boolean ligado;

    public Eletrodomestico(String marca, String modelo, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = ligado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
}
