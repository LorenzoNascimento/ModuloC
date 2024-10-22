package Funcionarios_8;

/**
 *
 * @author Lorenzo
 */
public class Vendedor extends Pessoas{
    
    private double comicao;
    
    public Vendedor(String nome, double altura, int idade, double comicao) {
        super(nome, altura, idade);
        this.comicao = comicao;
    }

    public double getComicao() {
        return comicao;
    }

    public void setComicao(double comicao) {
        this.comicao = comicao;
    }
    
}
