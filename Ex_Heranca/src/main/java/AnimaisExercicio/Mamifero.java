package AnimaisExercicio;

/**
 *
 * @author Lorenzo
 */
public class Mamifero extends Animais{
    
    private int patas;
    private String pelo;
            
    public Mamifero(String Nome, int idade, int patas, String pelo) {
        super(Nome, idade);
        this.patas = patas;
        this.pelo = pelo;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }
    
}
