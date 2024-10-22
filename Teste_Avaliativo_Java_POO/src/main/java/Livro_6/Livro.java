package Livro_6;

/**
 *
 * @author Lorenzo
 */
public class Livro {
    
    protected String titulo;
    protected String autor;
    protected boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public boolean emprestar(boolean disponivel){
        if(disponivel == false){
            System.out.println("Você emprestou o livro a alguem! Logo nâo está disponivel");
        }else{
            System.out.println("O livro está disponivel pois você não-o emprestou a numguem!");
        }
        
        return disponivel;
    }
}
