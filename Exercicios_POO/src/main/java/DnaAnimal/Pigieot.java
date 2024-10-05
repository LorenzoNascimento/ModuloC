package DnaAnimal;

/**
 *
 * @author Lorenzo
 */
public class Pigieot extends Aves{
    
        @Override
    public void locomover() {
        System.out.println("Voando, Caminhando, Planando, Saltitando, Surfando");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentação Variada");
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu, Piu, Piu");
    }
    
    public void bicada(){
        System.out.println("Mete bicada em todo mundo que passar a sua frente ");
    }
}
