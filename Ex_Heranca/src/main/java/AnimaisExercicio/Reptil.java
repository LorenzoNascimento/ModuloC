package AnimaisExercicio;

/**
 *
 * @author Lorenzo
 */
public class Reptil extends Animais{
    
    private int patas;
    private String nada;
    private String calda;
    
    public Reptil(String Nome, int idade, int patas, String nada, String calda) {
        super(Nome, idade);
        this.patas = patas;
        this.nada = nada;
        this.calda = calda;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getNada() {
        return nada;
    }

    public void setNada(String nada) {
        this.nada = nada;
    }

    public String getCalda() {
        return calda;
    }

    public void setCalda(String calda) {
        this.calda = calda;
    }
    
}
