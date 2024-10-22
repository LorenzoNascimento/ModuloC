package InterfaceVeiculo_11;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {

//    Carro
        Carro c = new Carro();
        c.acelerar();
        c.freiar();
        c.virar();
        System.out.println("\n");        
        
//    Moto
        Moto m = new Moto();
        m.acelerar();
        m.freiar();
        m.virar();
    }
}
