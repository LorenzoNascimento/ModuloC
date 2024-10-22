package Livro_6;

/**
 *
 * @author Lorenzo
 */
public class Main {
    public static void main(String[] args) {
        
    
    Livro l = new Livro("Bananas de pijama", "Sem internet para pesquisar");
        System.out.println("O nome do livro é: " + l.getTitulo());
        System.out.println("O altor do livro é: " + l.getAutor());
        l.emprestar(false);
        
//        Para criar um código separado para que informe se o livro está ou não disponivel
//        Assim deixando seu código mais organizado e de facil entendimento e manuzeio.

    }
}
