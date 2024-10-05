package DnaAnimal;

/**
 *
 * @author Lorenzo
 */
public class Tartaruga extends Repteis {

    @Override
    public void locomover() {
        System.out.println(" Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Come algas, as vezes canudos: F");
    }

    @Override
    public void emitirSom() {
        System.out.println("Sla Glup, Glup");
    }
    
    public void nadar() {
        System.out.println("Nada rapido");
    }
    
    

}
