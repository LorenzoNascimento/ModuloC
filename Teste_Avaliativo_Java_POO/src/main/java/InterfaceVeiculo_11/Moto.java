package InterfaceVeiculo_11;

/**
 *
 * @author Lorenzo
 */
public class Moto implements Veiculo{

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando");
    }

    @Override
    public void freiar() {
        System.out.println("A moto está freiando");
    }

    @Override
    public void virar() {
        System.out.println("A moto está virando");
    }
    
}
