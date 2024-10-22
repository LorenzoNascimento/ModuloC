package UsuariosdeumSistema;

/**
 *
 * @author Lorenzo
 */
public class Usuarios {
    
    protected String nome;
    protected String login;

    public Usuarios(String nome, String login) {
        this.nome = nome;
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
}
