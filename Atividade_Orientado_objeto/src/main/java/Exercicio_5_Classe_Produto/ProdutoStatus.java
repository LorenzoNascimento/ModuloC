package Exercicio_5_Classe_Produto;

/**
 *
 * @author Lorenzo
 */
public class ProdutoStatus {

    private String nome;
    private double preco;
    private int quantia;
    private int comprar;

    public ProdutoStatus(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantia = 10;
        this.comprar = 0;
    }

    public void status() {
        System.out.println("Produto: " + this.getNome());
        System.out.println("Preço: " + this.getPreco());
        System.out.println("Quantia " + this.getQuantia());
    }

    public int getQuantia() {
        return quantia;
    }

    public void setQuantia(int quantia) {
        this.quantia = quantia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void Quantia(int comprar) {
        if (quantia > 0 && quantia > comprar) {
            this.quantia -= comprar;
            System.out.println("Há " + quantia + " em estoque " + " e voce deseja comprar " + comprar);
        } else {
            System.out.println("Quantia invalido");
        }
    }
}
