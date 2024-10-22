package UsuariosdeumSistema;

/**
 *
 * @author Lorenzo
 */
public class Editor extends Usuarios{
    
    private boolean edicao;
    
    public Editor(String nome, String login, boolean edicao) {
        super(nome, login);
        this.edicao = edicao;
    }

    public boolean getEdicao() {
        return edicao;
    }

    public void setEdicao(boolean edicao) {
        this.edicao = edicao;
    }
    
}
