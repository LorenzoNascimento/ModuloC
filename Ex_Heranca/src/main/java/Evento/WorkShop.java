package Evento;

/**
 *
 * @author Lorenzo
 */
public class WorkShop extends Eventos{
    
    protected String instrutor;
    
    public WorkShop(String nome, int data, String instrutor) {
        super(nome, data);
        this.instrutor = instrutor;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }
    
}
