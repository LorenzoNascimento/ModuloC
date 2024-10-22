package MétodoDRY_25;

/**
 *
 * @author Lorenzo
 */
public class FormaGeometrica {
    protected double lado;

    public FormaGeometrica(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
