package Produtos;

/**
 *
 * @author Lorenzo
 */
public class Main {
    public static void main(String[] args) {
        
        
//        Livro
        Livro l = new Livro("Pai rico Pai pobre", 41.70, "Robert Kiyosaki e Sharon L. Letchter", 283685273);
        System.out.println("Nome: " + l.getNome());
        System.out.println("Preço: " + l.getPreco());
        System.out.println("Autor: " + l.getAutor());
        System.out.println("ISBN: " + l.getISBN());
        System.out.println("\n");
        
//        Eletronico
        Eletronico e = new Eletronico("Celular", 1200, 220);
        System.out.println("Eletronico: " + e.getNome());
        System.out.println("Preço: " + e.getPreco());
        System.out.println("Voltagem: " + e.getVoltagem());
        System.out.println("\n");
        
//        Roupa
        Roupa r = new Roupa("Casaco", 120.99, 42 );
        System.out.println("Nome: " + r.getNome());
        System.out.println("Preço: " + r.getPreco());
        System.out.println("Tamanho: " + r.getTamanho());
    }
}
