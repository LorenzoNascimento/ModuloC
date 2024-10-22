package Produtos;

/**
 *
 * @author Lorenzo
 */
public class Roupa extends Produtos{
    
    private int tamanho;
    
    public Roupa(String nome, double preco, int tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
}
