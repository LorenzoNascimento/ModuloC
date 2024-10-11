package AnimaisExercicio;

/**
 *
 * @author Lorenzo
 */
public class MainAnimais {
    public static void main(String[] args) {
        
//        Mamifero
        Mamifero m = new Mamifero("Cachorro", 5, 4, "Caramelo");
        System.out.println("Mamifero: " + m.getNome());
        System.out.println("Idade: " + m.idade);
        System.out.println("Quantia de patas: " + m.getPatas());
        System.out.println("Nome: " + m.getPelo());
        System.out.println("\n");
        
//        Ave
        Ave a = new Ave("Sabia", 1, "Tem duas asas", 2);
        System.out.println("Ave: " + a.getNome());
        System.out.println("Idade: " + a.getIdade());
        System.out.println("Tem asas? " + a.getAsas());
        System.out.println("Tem quantas patas? " + a.getPatas());
        System.out.println("\n");
        
//        Reptil
        Reptil r = new Reptil("Jacaré", 5, 4, "Sim", "Tem");
        System.out.println("Nome: " + r.getNome());
        System.out.println("Idade: " + r.getIdade());
        System.out.println("Patas: " + r.getPatas());
        System.out.println("Ele nada? " + r.getNada());
        System.out.println("Tem calda? " + r.getCalda());
        
    }
    
}
