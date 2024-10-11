package DnaAnimal;

/**
 *
 * @author Lorenzo
 */
public class Canguru_Jack extends Mamifero {

    public void usarBolsa() {
        System.out.println("Guardou o filhinho");
    }

    public void lutarBoxe() {
        System.out.println("Quebra todo mundo a pau");
    }

    @Override
    public void locomover() {
        System.out.println("Saltitando");
    }

    @Override
    public void alimentar() {
        System.out.println("Frutas e Folhas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }
}
