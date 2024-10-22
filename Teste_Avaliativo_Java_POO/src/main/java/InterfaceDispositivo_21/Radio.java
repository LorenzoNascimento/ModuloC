package InterfaceDispositivo_21;

/**
 *
 * @author Lorenzo
 */
public class Radio implements Dispositivo {

    private boolean energia;

    public Radio() {
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
        System.out.println("\nO radio está ligado, na estação ");
    }

    @Override
    public void desligar() {
        this.energia = false;
        System.out.println("\nO radio está desligado, ligue-o e selecione a estação que deseja ouvir");
    }

}
