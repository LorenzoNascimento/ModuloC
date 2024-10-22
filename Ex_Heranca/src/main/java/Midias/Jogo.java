package Midias;

/**
 *
 * @author Lorenzo
 */
public class Jogo extends Midia{
    
    private String plataforma;
    private String classificacao;
    
    public Jogo(String titulo, int duracao, String plataforma, String classificacao) {
        super(titulo, duracao);
        this.plataforma = plataforma;
        this.classificacao = classificacao;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
    
}
