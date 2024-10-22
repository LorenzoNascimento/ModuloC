package Interface_4;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {

//        Cachorro
        Cachorro c = new Cachorro();
        System.out.println("Som do cachorro: ");
        c.emitirSom();
        System.out.println("\n");

//        Gato
        Gato g = new Gato();
        System.out.println("Som do Gato: ");
        g.emitirSom();
    }
}
