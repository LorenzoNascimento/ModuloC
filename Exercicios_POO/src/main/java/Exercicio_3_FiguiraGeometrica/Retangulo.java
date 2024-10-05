package Exercicio_3_FiguiraGeometrica;

/**
 *
 * @author Lorenzo
 */
public class Retangulo implements FiguraAbstract{
    
    private double area;
    private double perimetro;
    private double base;
    private double altura;

    public Retangulo(double area, double perimetro, double base, double altura) {
        this.area = 0;
        this.perimetro = 0;
        this.base = 5;
        this.altura = 3;
    }

    @Override
    public double calcularArea() {
        area = base * altura;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        perimetro = base + base + altura + altura;
        return perimetro;
    }
    
}
