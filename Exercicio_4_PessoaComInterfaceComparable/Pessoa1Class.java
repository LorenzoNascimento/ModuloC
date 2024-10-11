package Exercicio_4_PessoaComInterfaceComparable;

/**
 *
 * @author Lorenzo
 */
public class Pessoa1Class implements PessoaInterface{
    
    private int idade1;
private int idade2;

    
    public Pessoa1Class(int idade) {
        this.idade1 = 16;
        this.idade2 = 17;
    }


    public int getIdade2() {
        return idade2;
    }

    public void setIdade2(int idade2) {
        this.idade2 = idade2;
    }

    public int getIdade() {
        return idade1;
    }

    public void setIdade(int idade) {
        this.idade1 = idade1;
    }

    @Override
    public int pessoa1() {
        if(idade1 == idade2){
            System.out.println("As idades são iguais. ");
        }else{
            System.out.println("\nAs idades são diferentes. ");
        }
        return idade1;
    }
    
}
