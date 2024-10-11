package Animais_2;

/**
 *
 * @author Lorenzo
 */
public abstract class Animal {
    
    protected String corPelo;
    protected String comida;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }
    
    public abstract void emitirSom();
    
}
