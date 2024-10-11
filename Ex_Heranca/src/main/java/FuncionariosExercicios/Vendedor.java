package FuncionariosExercicios;

/**
 *
 * @author Lorenzo
 */
public class Vendedor extends Funcionarios{
    
    private double comissao;
    public Vendedor(String nome, double salario, String cargo, int comissao) {
        super(nome, salario, cargo);
    this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
}
