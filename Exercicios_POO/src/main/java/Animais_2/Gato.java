package Animais_2;

/**
 *
 * @author Lorenzo
 */
public class Gato extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Miau, Miau");
    }
    
    public void comida(){
        System.out.println("Ração");
    }
    
    public void dormir() {
        System.out.println("Zzzzzz...");
    }
    
    public void corPelo() {
        System.out.println("Cinza");
    }
    
    
    
}
