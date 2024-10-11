package Exercicio_4_Classe_livro;

/**
 *
 * @author Lorenzo
 */
public class LivroStatus {
    
    private String titulo;
    private String autor;
    private int anopublicado;
    private boolean disponivel;

    public LivroStatus(String titulo, String autor, int anopublicado, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anopublicado = anopublicado;
        this.disponivel = disponivel;
    }
    
    public void Listar() { 
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Ano de publicação: " + this.getAnopublicado());
        if (this.getDisponivel() == true){
            System.out.println("O livro está disponivel");
        }else {
            System.out.println("O livro nâo está disponivel");
        }
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

    public int getAnopublicado() {
        return anopublicado;
    }

    public void setAnopublicado(int anopublicado) {
        this.anopublicado = anopublicado;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public void Emprestar(){
        this.disponivel = false;
    }
    public void Devolver(){
        this.disponivel = true;
    }
}
