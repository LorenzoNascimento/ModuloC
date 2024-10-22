package InterfaceDispositivo_21;

/**
 *
 * @author Lorenzo
 */
public class Televisao implements Dispositivo {

    private boolean energia;

    public void Televisao() {
        this.energia = energia;
    }

    public boolean isEnergia() {
        return energia;
    }

    public void setEnergia(boolean energia) {
        this.energia = energia;
    }

    @Override
    public void ligar() {
        this.energia = true;
        System.out.println("\nA televisão está ligada");
    }

    @Override
    public void desligar() {
        this.energia = false;
        System.out.println("\nA televisão está desligada, Ligue-o");
    }

}
