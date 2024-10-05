package Exercicio_3_FiguiraGeometrica;

/**
 *
 * @author Lorenzo
 */
public class Circulo implements FiguraAbstract{
    
    private double raio;
//    private double area;
//    private double perimetro;

//    public Circulo(double raio, double area, double perimetro) {
//        this.raio = 5;
//        this.area = 0;
//        this.perimetro = 0;
//    }


    public Circulo(double raio) {
        this.raio = raio;
    }

    Circulo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
       
        return    2* Math.PI * raio;
    }
    
}
