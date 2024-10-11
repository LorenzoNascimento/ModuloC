package FuncionariosExercicios;

/**
 *
 * @author Lorenzo
 */
public class Main {
    public static void main(String[] args) {
        
//        Gerente
        Gerente g = new Gerente("Lorenzo", 7000.00, "Gerente", "Setor Economico");
        System.out.println("Nome: " + g.getNome());
        System.out.println("Salario: " + g.getSalario());
        System.out.println("Cargo: " + g.getCargo());
        System.out.println("Setor: " + g.getGerencia());
        System.out.println("\n");
        
//        Vendedor
        Vendedor v = new Vendedor("Lorenzo", 3500.00, "Vendedor", 10);
        System.out.println("Nome: " + v.getNome());
        System.out.println("Salario: " + v.getSalario() );
        System.out.println("Cargo: " + v.getCargo());
        System.out.println("Comissao: " + v.getComissao() + "%");
        System.out.println("\n");
        
//        Desenvolvedor
        Desenvolvedor d = new Desenvolvedor("Lorenzo", 10000.00, "Desenvolvedor", "JavaScript");
        System.out.println("Nome: " + d.getNome());
        System.out.println("Salario: " + d.getSalario());
        System.out.println("Cargo: " + d.getCargo());
        System.out.println("Linguagem: " + d.getLinguagem());
        System.out.println("\n");
        
    }
    
}
