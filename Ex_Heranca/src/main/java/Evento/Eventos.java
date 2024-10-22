package Evento;

/**
 *
 * @author Lorenzo
 */
public class Eventos {
    
    protected String nome;
    protected int data;

    public Eventos(String nome, int data) {
        this.nome = nome;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    
}
