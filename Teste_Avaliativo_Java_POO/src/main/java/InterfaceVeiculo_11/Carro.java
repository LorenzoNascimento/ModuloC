package InterfaceVeiculo_11;

/**
 *
 * @author Lorenzo
 */
public class Carro implements Veiculo{

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando");
    }

    @Override
    public void freiar() {
        System.out.println("O carro está freiando");
    }

    @Override
    public void virar() {
        System.out.println("O carro está Virando");
    }
    
}
