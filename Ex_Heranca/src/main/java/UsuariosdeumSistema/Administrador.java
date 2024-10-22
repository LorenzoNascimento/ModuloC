package UsuariosdeumSistema;

/**
 *
 * @author Lorenzo
 */
public class Administrador extends Usuarios{
    
    private String nivelAcesso;
    
    public Administrador(String nome, String login, String nivelAcesso) {
        super(nome, login);
        this.nivelAcesso = nivelAcesso;
        
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
}
