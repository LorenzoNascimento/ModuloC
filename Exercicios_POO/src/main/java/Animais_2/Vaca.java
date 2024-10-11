package Animais_2;

/**
 *
 * @author Lorenzo
 */
public class Vaca extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Móóóóóóó");
    }
    
    public void tirarLeite() {
        System.out.println("Psi, psi, psi");
    }
    
    public void beberAgua() {
        System.out.println("Glup, Glup");
    }
    
    public void corPelo() {
        System.out.println("Couro: Marrom");
    }
    
    public void comida() {
        System.out.println("Ração");
    }
}
