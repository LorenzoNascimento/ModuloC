package DispositivoEletronicoExercicio;

/**
 *
 * @author Lorenzo
 */
public class Smartphone extends DispositivoEletronico{
    
    private double tamanhoTela;
    
    public Smartphone(String marca, String modelo, double tamanhoTela) {
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
