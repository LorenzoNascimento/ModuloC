package PessoaExercicio;

/**
 *
 * @author Lorenzo
 */
public class Funcionario extends Pessoa{
    
    private String cargo;
    
    public Funcionario(String nome, int idade, String endereco, String cargo) {
        super(nome, idade, endereco);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
