package ClasseFuncionario_23;

/**
 *
 * @author Lorenzo
 */
public class Funcionario implements Pagavel{
    
    private int idade;

    public Funcionario() {
        this.idade = 67;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public void calcularPagamento() {
        if(idade >= 60 && idade < 70){
            System.out.println("Voce pagou com 60% de desconto");
        }else if(idade >= 70 && idade < 80){
            System.out.println("Voce pagou com 70% de desconto");
        }else if(idade >= 80){
            System.out.println("Voce pagou com 80% de desconto");
        }
    }
    
    
}
