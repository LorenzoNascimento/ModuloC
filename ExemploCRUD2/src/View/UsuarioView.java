package View;

import Control.UsuarioController;
import Model.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class UsuarioView {

    private UsuarioController usuarioController;

    public UsuarioView(UsuarioController usuarioController) {
        this.usuarioController = usuarioController;
    }

    public void add() throws SQLException {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = teclado.nextLine();

        System.out.print("Usuario: ");
        String usuario = teclado.nextLine();

        System.out.print("Senha: ");
        String senha = teclado.nextLine();
        usuarioController.add(nome, usuario, senha);
    }

    public void getAll() {
        for (Usuario u : usuarioController.getAll()) {
            System.out.print("Id: ");
            System.out.print(u.getId() + "\t");
            System.out.print("Nome: ");
            System.out.print(u.getNome() + "\t");
            System.out.print("Usuario: ");
            System.out.print(u.getUsuario() + "\t");
            System.out.print("Senha: ");
            System.out.println(u.getSenha());
        }
    }

    public void getById() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ID: ");
        int id = teclado.nextInt();
        Optional<Usuario> u = usuarioController.getById(id);
        u.ifPresentOrElse(
                us -> System.out.println("ID: " + us.getId() + "\tNome: " + us.getNome()), //Se esse estiver vazio executa o de baixo
                () -> System.out.println("Não encontrado"));
    }

    public void getByNome() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = teclado.nextLine();
        ArrayList<Usuario> resposta = usuarioController.getByNome(nome);
        if (resposta.isEmpty()) {
            System.out.println("Não foram encontrados usuarios com este nome.");
        } else {
            for (Usuario u : resposta) {
                System.out.print("Id: ");
                System.out.print(u.getId() + "\t");
                System.out.print("Nome: ");
                System.out.print(u.getNome() + "\t");
                System.out.print("Usuario: ");
                System.out.print(u.getUsuario() + "\t");
                System.out.print("Senha: ");
                System.out.println(u.getSenha());
            }

        }
    }

    public void delete() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ID para exclusão");
        int id = teclado.nextInt();
        if (usuarioController.delete(id)) {
            System.out.println("Usuario excluido com sucesso!");
        } else {
            System.out.println("Usuario não encontrado");
        }
    }

    public void update() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ID: ");
        int id = teclado.nextInt();
        teclado.skip("\\R");
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Usuario: ");
        String usuario = teclado.nextLine();
        System.out.print("Senha: ");
        String senha = teclado.nextLine();
        if (usuarioController.update(id, nome, usuario, senha)) {
            System.out.println("Usuario Atualizado!");
        } else {
            System.out.println("Usuario não encontrado!");
        }
    }

    public void showMenu() throws SQLException {
        Scanner teclado = new Scanner(System.in);
        while(true){
            System.out.println("\nGESTÃO DE USUARIOS\n");
            System.out.println("1 - Adicionar usuario");
            System.out.println("2 - Listar todos os usuarios");
            System.out.println("3 - Localizar usuario por código");
            System.out.println("4 - Localizar usuario por nome");
            System.out.println("5 - Alterar dados de um usuario");
            System.out.println("6 - Excluir usuario");
            System.out.println("7 - Sair\n");
            System.out.print("Opção: ");
            int opcao = teclado.nextInt();
            switch(opcao){
                case 1 -> add();
                case 2 -> getAll();
                case 3 -> getById();
                case 4 -> getByNome();
                case 5 -> update();
                case 6 -> delete();
                case 7 -> System.exit(0);
                default -> System.out.println("Opção invalida");
                    
            }
            
        }
    }
}
