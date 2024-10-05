package DnaAnimal;

/**
 *
 * @author Lorenzo
 */
public class Cobra extends Repteis {

    
    public void corEscamaCobra() {
        System.out.println("A cor da escama é cinza com pontos verdes");
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
        System.out.println("PSSSIIIIII");
    }
}
