package Produtos;

/**
 *
 * @author Lorenzo
 */
public class Livro extends Produtos{
    
    private String autor;
    private int ISBN;
    
    public Livro(String nome, double preco, String autor, int ISBN) {
        super(nome, preco);
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    
}
