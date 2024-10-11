package Exercicio_4_Pessoa;

/**
 *
 * @author Lorenzo
 */
public class PessoaComando {

    public class PessoaComando 
    private int nome;    
    private int idade;

    public PessoaComando(int nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
