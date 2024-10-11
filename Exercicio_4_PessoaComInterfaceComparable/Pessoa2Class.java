package Exercicio_4_PessoaComInterfaceComparable;

/**
 *
 * @author Lorenzo
 */
public class Pessoa2Class implements PessoaInterface{

    private int idade1;
    private int idade2;
private boolean idades;
    
    public Pessoa2Class(int idade1, int idade2) {
        this.idade1 = 17;
        this.idade2 = 17;
    }

    public int getIdade1() {
        return idade1;
    }

    public void setIdade1(int idade1) {
        this.idade1 = idade1;
    }

    public int getIdade2() {
        return idade2;
    }

    public void setIdade2(int idade2) {
        this.idade2 = idade2;
    }
    
    @Override
    public int pessoa1() {
        if(idade1 == idade2) {
            idades = true;
            System.out.println("As idades são iguais. ");
        }else {
            idades = false;
            System.out.println("\nAs idades são diferentes. ");
        }
        return idade1;
    }


    
}
