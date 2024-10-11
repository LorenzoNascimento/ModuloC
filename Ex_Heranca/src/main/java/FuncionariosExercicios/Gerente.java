package FuncionariosExercicios;

/**
 *
 * @author Lorenzo
 */
public class Gerente extends Funcionarios{
    
    private String gerencia;
    
    public Gerente(String nome, double salario, String cargo, String gerencia) {
        super(nome, salario, cargo);
        this.gerencia = gerencia;
    }

    public String getGerencia() {
        return gerencia;
    }

    public void setGerencia(String gerencia) {
        this.gerencia = gerencia;
    }
    
}
