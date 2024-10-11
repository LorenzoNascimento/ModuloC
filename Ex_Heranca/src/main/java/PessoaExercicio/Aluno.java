package PessoaExercicio;

/**
 *
 * @author Aluno
 */
public class Aluno extends Pessoa{
    
    private int matricula;
    
    public Aluno(String nome, int idade, String endereco, int matricula) {
        super(nome, idade, endereco);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
