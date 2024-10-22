package InterfaceDispositivo_21;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        
//        Televisão
        Televisao t = new Televisao();
//        t.ligar();
        t.desligar();

//        Radio
        Radio r = new Radio();
        r.desligar();
        r.ligar();
    }
}
