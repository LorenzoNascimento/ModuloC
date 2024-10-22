package Aluno_27;

/**
 *
 * @author Lorenzo
 */
public class Aluno extends Pessoa{
    
    private int matricula;
    private String turma;
    
    public Aluno(String nome, double altura, int idade, int matricula, String turma) {
        super(nome, altura, idade);
        this.matricula = matricula;
        this.turma = turma;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    

    
}
