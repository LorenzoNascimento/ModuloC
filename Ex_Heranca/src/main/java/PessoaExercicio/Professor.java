package PessoaExercicio;

/**
 *
 * @author Lorenzo
 */
public class Professor extends Pessoa{
    
    private String disciplina;
    
    public Professor(String nome, int idade, String endereco, String disciplina) {
        super(nome, idade, endereco);
        this.disciplina = disciplina;
        
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
}
