package Funcionarios_8;

/**
 *
 * @author Lorenzo
 */
public class Main {
    public static void main(String[] args) {
    
//      Funcionarios
    Funcionarios f = new Funcionarios("Lorenzo", 1.79, 17, "Vendedor");
        System.out.println("Funcionario");
        System.out.println("Nome: " + f.getNome());
        System.out.println("Altura: " + f.getAltura());
        System.out.println("Idade: " + f.getIdade());
        System.out.println("Cargo: " + f.getCargo());
        System.out.println("\n");
        
//        Gerente
    Gerente g = new Gerente("Lorenzo", 1.79, 17, "Geremte de vendas");
        System.out.println("Gerente");
        System.out.println("Nome: " + g.getNome());
        System.out.println("Altura: " + g.getAltura());
        System.out.println("Idade: " + g.getIdade());
        System.out.println("Gerencia: " + g.getGerencia());
        System.out.println("\n");
        
//        Vendedor
        Vendedor v = new Vendedor("Lorenzo", 1.79, 17, 10);
        System.out.println("Vendedor");
        System.out.println("Nome: " + v.getNome());
        System.out.println("Altura: " + v.getAltura());
        System.out.println("Idade: " + v.getIdade());
        System.out.println("Comição: " + v.getComicao() + "%");
    }
}
