package FuncionariosExercicios;

/**
 *
 * @author Lorenzo
 */
public class Desenvolvedor extends Funcionarios{
    
    private String linguagem;
    
    public Desenvolvedor(String nome, double salario, String cargo, String linguagem) {
        super(nome, salario, cargo);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
    
}
