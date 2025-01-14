package Model;

/**
 *
 * @author Lorenzo
 */
public class Usuario {
    
    
    //Variaveis da tela de login para salvar no MySQL
    private int id;
    private String nome;
    private String usuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

        
}
