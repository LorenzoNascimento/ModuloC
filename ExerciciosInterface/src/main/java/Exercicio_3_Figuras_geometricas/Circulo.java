package Exercicio_3_Figuras_geometricas;

/**
 *
 * @author Lorenzo
 */
public class Circulo implements FigurasInterface {

    private double raio;
    private double perimetro;
    private double area;

    public Circulo(double raio, double perimetro, double area) {
        this.raio = 4;
        this.perimetro = perimetro;
        this.area = area;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double area() {
        return area = raio * Math.PI * 2;
    }

    @Override
    public double perimetro() {
        return perimetro = 2 * Math.PI  * raio;
    }

}
