package Animais_2;

/**
 *
 * @author Lorenzo
 */
public class AnimalMain {
    
    public static void main(String[] args) {
        
//      Cachorro
        Cachorro c = new Cachorro();
        c.abanarRabo();
        c.emitirSom();
        c.comida();
        System.out.println("\n");
        
//      Gato
        Gato g = new Gato();
        g.comida();
        g.corPelo();
        g.dormir();
        g.emitirSom();
        System.out.println("\n");
        
//      Vaca
        Vaca v = new Vaca();
        v.comida();
        v.corPelo();
        v.beberAgua();
        v.emitirSom();
    }
    
}
