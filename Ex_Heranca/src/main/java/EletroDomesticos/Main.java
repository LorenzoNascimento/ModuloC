package EletroDomesticos;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {

//        Televisao
        Televisao t = new Televisao("Sansung", "75Q60D", true, "SBT", 32);
        System.out.println("Televisão");
        System.out.println("Marca: " + t.getMarca());
        System.out.println("Modelo: " + t.getModelo());
        if (t.ligado == true) {
            System.out.println("A televisão está ligada.");
        } else {
            System.out.println("A televisão está desligada.");
        }
        System.out.println("Canal: " + t.getCanal());
        System.out.println("Volume: " + t.getVolume());
        System.out.println("\n");

//        Geladeira
        Geladeira g = new Geladeira("Consul", "CRM44AKA", true, -2);
        System.out.println("Geladeira");
        System.out.println("Marca: " + g.getMarca());
        System.out.println("Modelo: " + g.getModelo());
        if (t.ligado == true) {
            System.out.println("A geladeira está ligada. ");
        } else {
            System.out.println("A geladeira etá desligada. ");
        }
        System.out.println("Temperatura: " + g.getTemperatura());
        System.out.println("\n");

        Microondas m = new Microondas("Midea", "MRAS2", false, 700);
        System.out.println("Marca: " + m.getMarca());
        System.out.println("Modelo: " + m.getMarca());
        if (m.ligado == true) {
            System.out.println("O microondas está ligado. ");
        } else {
            System.out.println("O microondas está desligado");
        }
        System.out.println("Potencia: " + m.getPotencia() + "W");
    }
}
