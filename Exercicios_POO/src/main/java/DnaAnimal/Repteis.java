package DnaAnimal;

/**
 *
 * @author Lorenzo
 */
public class Repteis extends Animal {

    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println(" Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentação: Variada");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }

}
