package DnaAnimal;

/**
 *
 * @author Lorenzo
 */
public class SnoopDog extends Mamifero {

    public void abanarRabo() {
        System.out.println("Ele está feliz");
    }

    public void pedirComida() {
        System.out.println("Fazer gracinha");
    }

    @Override
    public void alimentar() {
        System.out.println("Ração");
    }

    @Override
    public void locomover() {
        System.out.println("Correndo e caminhando com quatro patas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }
}
