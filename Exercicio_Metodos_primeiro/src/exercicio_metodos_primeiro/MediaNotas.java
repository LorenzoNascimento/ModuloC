package exercicio_metodos_primeiro;

/**
 *
 * @author Lorenzo
 */
public class MediaNotas {

    private double[] notas;

//    Construtor para inicializar as notas
    public MediaNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
