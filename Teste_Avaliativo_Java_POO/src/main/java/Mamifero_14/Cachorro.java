package Mamifero_14;

/**
 *
 * @author Lorenzo
 */
public class Cachorro extends Mamifero{
    
    private int quantiaPatas;
    
    public Cachorro(String tipoPelo, int quantiaPatas) {
        super(tipoPelo);
        this.quantiaPatas = quantiaPatas;
    }

    public int getQuantiaPatas() {
        return quantiaPatas;
    }

    public void setQuantiaPatas(int quantiaPatas) {
        this.quantiaPatas = quantiaPatas;
    }
    
}
