package AnimaisExercicio;

/**
 *
 * @author Lorenzo
 */
public class Animais {
    
    protected String Nome;
    protected int idade;

    public Animais(String Nome, int idade) {
        this.Nome = Nome;
        this.idade = idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
