package PessoaExercicio;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {

//    Pessoa
        Aluno a = new Aluno("Lorenzo", 17, "Tramandai", 156);
        System.out.println("Nome: " + a.getNome());
        System.out.println("Idade: " + a.getIdade());
        System.out.println("Endereço: " + a.getEndereco());
        System.out.println("Matricula: " + a.getMatricula());
        System.out.println("\n");
        
//        Professor
        Professor p = new Professor("Lorenzo", 26, "Tramandai", "Ir em bora");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());  
        System.out.println("Endereço: " + p.getEndereco());
        System.out.println("Disciplina: " + p.getDisciplina());
        System.out.println("\n");
        
//        Funcionario
        Funcionario f = new Funcionario("Lorenzo", 32, "Tramandai", "Vendedor do bar");
        System.out.println("Nome: " + f.getNome());
        System.out.println("Idade: " + f.getIdade());
        System.out.println("Endereço: " + f.getEndereco());
        System.out.println("Cargo: " + f.getCargo());
    } 
}
