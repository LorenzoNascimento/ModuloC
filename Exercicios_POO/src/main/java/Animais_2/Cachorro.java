package Animais_2;

/**
 *
 * @author Lorenzo
 */
public class Cachorro extends Animal{

    public void comida() {
        System.out.println("Ração");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Au, Au, Au...");
    }
    
    public void abanarRabo() {
        System.out.println("Abanar Rabo!");
    }
    
}
