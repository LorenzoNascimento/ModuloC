package Evento;

/**
 *
 * @author Lorenzo
 */
public class Palestra extends Eventos{
    
        protected String palestrante;
    
    public Palestra(String nome, int data, String palestrante) {
        super(nome, data);
        this.palestrante = palestrante;
    }

    public String getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(String palestrante) {
        this.palestrante = palestrante;
    }
    
}
