package Funcionarios_8;

/**
 *
 * @author Lorenzo
 */
public class Gerente extends Pessoas{
    
    private String gerencia;
    
    public Gerente(String nome, double altura, int idade, String gerencia) {
        super(nome, altura, idade);
        this.gerencia = gerencia;
    }

    public String getGerencia() {
        return gerencia;
    }

    public void setGerencia(String gerencia) {
        this.gerencia = gerencia;
    }
    
}
