package DnaAnimal;

/**
 *
 * @author Lorenzo
 */
public class Peixes extends Animal {

    private String corEscama;
    private String Barbatana;
    private String Dentes;

    public void fazerBolhas() {
        System.out.println("Bolhas Bolhas, Minhas Bolhas - Nemo");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public String getBarbatana() {
        return Barbatana;
    }

    public void setBarbatana(String Barbatana) {
        this.Barbatana = Barbatana;
    }

    public String getDentes() {
        return Dentes;
    }

    public void setDentes(String Dentes) {
        this.Dentes = Dentes;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Nadar");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentação: Variada");
    }

    @Override
    public void emitirSom() {
        System.out.println("Gloop, Gloop");
    }
}
