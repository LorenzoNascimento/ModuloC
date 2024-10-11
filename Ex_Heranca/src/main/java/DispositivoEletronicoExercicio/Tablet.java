package DispositivoEletronicoExercicio;

/**
 *
 * @author Lorenzo
 */
public class Tablet extends DispositivoEletronico{
    
    private double tamanhoTela;
    
    public Tablet(String marca, String modelo, double tamanhoTela) {
        super(marca, modelo);
    this.tamanhoTela = tamanhoTela;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }
    
}
