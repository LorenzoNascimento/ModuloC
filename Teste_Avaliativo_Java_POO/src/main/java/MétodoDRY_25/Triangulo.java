package MétodoDRY_25;

/**
 *
 * @author Lorenzo
 */
public class Triangulo extends FormaGeometrica{
    
    private double area;
    public Triangulo(double lado) {
        super(lado);
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public void calcularArea(){
        lado = lado * lado;
        double raiz = lado * 1.73;
        area = raiz / 4;
        System.out.println("A area do triangulo é: " + area);
    }
    
}
