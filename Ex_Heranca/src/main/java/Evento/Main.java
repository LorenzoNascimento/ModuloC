package Evento;

/**
 *
 * @author Lorenzo
 */
public class Main {
    public static void main(String[] args) {
//        Show
        Show s = new Show("Foró", 27102024, "Xitâozinho e Xororó");
        System.out.println("Nome: " + s.getNome());
        System.out.println("Data: " + s.getData());
        System.out.println("Artista: " + s.getArtistas());
        System.out.println("\n");
        
//        Palestra
        Palestra p = new Palestra("Economia", 14052024, "Pablo Marçal");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Data: " + p.getData());
        System.out.println("Palestrante: " + p.getPalestrante());
        System.out.println("\n");
        
//        WorkShop
        WorkShop w = new WorkShop("Loja", 23072024, "Carinha logo alí");
        System.out.println("Nome: " + w.getNome());
        System.out.println("Data: " + w.getData());
        System.out.println("Instrutor: " + w.getInstrutor());
    }
    
}
