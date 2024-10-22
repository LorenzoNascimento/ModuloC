package DispositivoEletronico_10;

/**
 *
 * @author Lorenzo
 */
public class Main {
    public static void main(String[] args) {
        
//        Smartphone
        Smartphone s = new Smartphone("Sansung", "S24 Ultra", 4500);
        System.out.println("Marca: " + s.getMarca());
        System.out.println("Modelo: " + s.getModelo());
        System.out.println("Preço: " + s.getPreco());
        System.out.println("\n");
        
//        Tablet
        Tablet t = new Tablet("Sansung", "Galaxy Tab A9", 6000);
        System.out.println("Marca: " + t.getMarca());
        System.out.println("Modelo: " + t.getModelo());
        System.out.println("Preço: " + t.getPreco());
        System.out.println("\n");
        
//        Ela herda atributos de outras classe para que possa ser utilizada em subclasses
//        sem o trabalho de ter que estar reescrevendo todo o codigo e o deixando mais organizado
        
    }
}
