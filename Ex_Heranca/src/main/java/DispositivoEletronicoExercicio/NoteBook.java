package DispositivoEletronicoExercicio;

/**
 *
 * @author Lorenzo
 */
public class NoteBook extends DispositivoEletronico{
    
    private double armazenamento;
    
    public NoteBook(String marca, String modelo, double armazenamento) {
        super(marca, modelo);
        this.armazenamento = armazenamento;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }
    
}
