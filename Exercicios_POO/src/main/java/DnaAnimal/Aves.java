package DnaAnimal;

/**
 *
 * @author Lorenzo
 */
public class Aves extends Animal {

    private String corPena;

    public void fazerNinho() {
        System.out.println("Fazer Ninho.");

    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

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
}
