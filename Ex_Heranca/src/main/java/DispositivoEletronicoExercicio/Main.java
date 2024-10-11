package DispositivoEletronicoExercicio;

/**
 *
 * @author Lorenzo
 */
public class Main {
    public static void main(String[] args) {
        
//        Smartphone
        Smartphone s = new Smartphone("Sansung", "Galaxy M52", 6.7);
        System.out.println("Marca: " + s.getMarca());
        System.out.println("Modelo: " + s.getModelo());
        System.out.println("Tela polegadas " + s.getTamanhoTela());
        System.out.println("\n");
        
//        Tablet
        Tablet t = new Tablet("Sansung", "Galaxy Tab A9", 11);
        System.out.println("Marca: " + t.getMarca());
        System.out.println("Modelo: " + t.getModelo());
        System.out.println("Tela polegadas: " + t.getTamanhoTela());
        System.out.println("\n");
        
//        Notebook
        NoteBook n = new NoteBook("Acer", "Nitro 5", 512);
        System.out.println("Marca: " + n.getMarca());
        System.out.println("Modelo: " + n.getModelo());
        System.out.println("Armazenamento: " + n.getArmazenamento());
    }
    
}
