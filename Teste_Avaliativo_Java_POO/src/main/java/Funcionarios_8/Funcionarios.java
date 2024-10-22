package Funcionarios_8;

/**
 *
 * @author Lorenzo
 */
public class Funcionarios extends Pessoas{
    
    private String cargo;
    
    public Funcionarios(String nome, double altura, int idade, String cargo) {
        super(nome, altura, idade);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
