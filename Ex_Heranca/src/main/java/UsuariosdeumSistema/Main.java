package UsuariosdeumSistema;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {

//        Administrador
        Administrador a = new Administrador("Lorenzo", "Lorenzonascimentomuniz", "Acesso total");
        System.out.println("Nome: " + a.getNome());
        System.out.println("Login: " + a.getLogin());
        System.out.println("Acesso: " + a.getNivelAcesso());
        System.out.println("\n");

//        Editor
        Editor e = new Editor("Lorenzo", "Lorenzonascimentomuniz", true);
        System.out.println("Nome: " + e.getNome());
        System.out.println("Login: " + e.getLogin());
        if (e.getEdicao() == true) {
            System.out.println("Você tem ermissão para editar. ");
        } else {
            System.out.println("Você nâo tem permissão para editar. ");
        }
        System.out.println("\n");

//        Leitor
        Leitor l = new Leitor("Lorenzo", "Lorenzonascimentomuniz", true);
        System.out.println("Nome: " + l.getNome());
        System.out.println("Login: " + l.getLogin());
        if (l.getHistoricoLeitura() == true) {
            System.out.println("O historico de leitura está habilitado. ");
        } else {
            System.out.println("O historico de leitura está desabilitado. ");
        }
        System.out.println("\n");

    }
}
