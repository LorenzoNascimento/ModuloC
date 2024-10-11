package Exercicio_3_Figuras_geometricas;

/**
 *
 * @author Lorenzo
 */
public class Quadrado implements FigurasInterface {

    private double altura;
    private double base;
    private double area;
    private double perimetro;

    public Quadrado(double altura, double base, double area, double perimetro) {
        this.altura = 4;
        this.base = 6;
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }


    @Override
    public double area() {
        return area = base * altura;

    }

    @Override
    public double perimetro() {
        return perimetro = base + base + altura + altura;
    }
}
