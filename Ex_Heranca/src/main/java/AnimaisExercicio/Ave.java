package AnimaisExercicio;

/**
 *
 * @author Lorenzo
 */
public class Ave extends Animais{
    
    private String asas;
    private int patas;
    
    public Ave(String Nome, int idade,String asas, int patas) {
        super(Nome, idade);
        this.asas = asas;
        this.patas = patas;
    }

    public String getAsas() {
        return asas;
    }

    public void setAsas(String asas) {
        this.asas = asas;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    
}
