package DnaAnimal;

/**
 *
 * @author Lorenzo
 */
public class PerolaBaleia extends Mamifero{
    
        @Override
    public void locomover() {
        System.out.println("Nada rapido");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentação: Variada");
    }

    @Override
    public void emitirSom() {
        System.out.println("brumm");
    }
    
    public void soltaAgua(){
        System.out.println("-Jato de Aguá para cima");
    }
}
