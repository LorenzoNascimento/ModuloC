package Evento;

/**
 *
 * @author Lorenzo
 */
public class Show extends Eventos{
    
    private String artistas;
    
    public Show(String nome, int data, String artistas) {
        super(nome, data);
        this.artistas = artistas;
    }

    public String getArtistas() {
        return artistas;
    }

    public void setArtistas(String artistas) {
        this.artistas = artistas;
    }
    
}
