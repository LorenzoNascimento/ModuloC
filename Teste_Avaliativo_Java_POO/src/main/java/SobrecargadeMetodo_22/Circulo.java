package SobrecargadeMetodo_22;

/**
 *
 * @author Lorenzo
 */
public class Circulo {
    
    protected double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public void calcularArea(){
        raio = raio * raio;
        double area = raio * 3.14;
        System.out.println("A area do circulo é de: " + area);
    }
    public void calcularArea2(){
        double area2 = Math.PI * raio;
        System.out.println("\nO valor da area do segundo método é " + area2);
    }
    
    
}
