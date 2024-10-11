package DnaAnimal;

/**
 *
 * @author Lorenzo
 */
// extends = erança: passar entre geraçoes ex: ter olho verde, passará para meu filho
public class Mamifero extends Animal {

    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Locomoção: Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentação: Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }

}
