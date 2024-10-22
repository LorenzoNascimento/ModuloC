package UsuariosdeumSistema;

/**
 *
 * @author Lorenzo
 */
public class Leitor extends Usuarios{
    
    private boolean historicoLeitura;
    
    public Leitor(String nome, String login, boolean historicoLeitura) {
        super(nome, login);
        this.historicoLeitura = historicoLeitura;
    }

    public boolean getHistoricoLeitura() {
        return historicoLeitura;
    }

    public void setHistoricoLeitura(boolean historicoLeitura) {
        this.historicoLeitura = historicoLeitura;
    }
    
}
