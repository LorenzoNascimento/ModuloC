package Aluno_27;

/**
 *
 * @author Lorenzo
 */
public class Main {
    public static void main(String[] args) {
        
//        Pessoa
        Pessoa p = new Pessoa("Lorenzo", 1.79, 17);
        
        System.out.println("Nome: " + p.getNome());
        System.out.println("Altura: " + p.getAltura());
        System.out.println("Idade: " + p.getIdade());
        
//        Aluno
        Aluno a = new Aluno("Lorenzo", 1.79, 17, 512324, "2°");
        
        System.out.println("Nome: " + a.getNome());
        System.out.println("Altura: " + a.getAltura());
        System.out.println("Idade: " + a.getIdade());
        System.out.println("Matricula: " + a.getMatricula());
        System.out.println("Turma: " + a.getTurma());

//        Para não ter que reescrever o mesmo código com apenas algumas informações amais novamente
    }
}
