package FornecedorView;

import FornecedorController.FornecedorController;
import FornecedorDAO.Fornecedor;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class FornecedorView {

    private FornecedorController fornecedorController;

    public FornecedorView(FornecedorController fornecedorController) {
        this.fornecedorController = fornecedorController;
    }

    public void add() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        System.out.print("CodeNome: ");
        String codenome = teclado.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = teclado.nextLine();
        fornecedorController.add(nome, codenome, cnpj);
    }

    public void getAll() {
        Scanner teclado = new Scanner(System.in);
        for (Fornecedor f : fornecedorController.getAll()) {
            System.out.print("ID: ");
            System.out.print(f.getId() + "\t");
            System.out.print("Nome: ");
            System.out.print(f.getNome() + "\t");
            System.out.print("Code Nome: ");
            System.out.print(f.getCodenome() + "\t");
            System.out.print("CNPJ: ");
            System.out.print(f.getCnpj() + "\t");
        }
    }

    public void getById() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ID: ");
        int id = teclado.nextInt();
        Optional<Fornecedor> f = fornecedorController.getById(id);
        f.ifPresentOrElse(
                fs -> System.out.print("ID: " + fs.getId() + "\tNome: " + fs.getNome() + "\tCode Nome: " + fs.getCodenome() + "\tCNPJ: " + fs.getCnpj()),
                () -> System.out.println("Não encontrado"));
    }

    public void getByCodenome() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Razão social: ");
        String codenome = teclado.nextLine();
        ArrayList<Fornecedor> resposta = fornecedorController.getByCodenome(codenome);
        if (resposta.isEmpty()) {
            System.out.println("Não foram encontrados usuarios com este nome.");
        } else {
            for (Fornecedor f : resposta) {
                System.out.print("Id: ");
                System.out.print(f.getId() + "\t");
                System.out.print("Nome: ");
                System.out.print(f.getNome() + "\t");
                System.out.print("Rasão social: ");
                System.out.print(f.getCodenome() + "\t");
                System.out.print("CNPJ: ");
                System.out.print(f.getCnpj() + "\t");

            }
        }
    }

    public void getByCnpj() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Cnpj: ");
        String cnpj = teclado.nextLine();
        ArrayList<Fornecedor> resposta = fornecedorController.getByCnpj(cnpj);
        if(resposta.isEmpty()) {
            System.out.println("Não foi possivel encontrar este cnpj. ");
        }else {
            for(Fornecedor f : resposta) {
                System.out.print("Id: ");
                System.out.print(f.getId() + "\t");
                System.out.print("Nome: ");
                System.out.print(f.getNome() + "\t");
                System.out.print("Rasão social: ");
                System.out.print(f.getCodenome() + "\t");
                System.out.print("CNPJ: ");
                System.out.print(f.getCnpj() + "\t");
            }
        }
    }

    public void update() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ID: ");
        int id = teclado.nextInt();
        teclado.skip("\\R");
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Code Nome: ");
        String codenome = teclado.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = teclado.nextLine();
        if (fornecedorController.Update(id, nome, codenome, cnpj)) {
            System.out.println("Usuario atuaizao com sucesso");
        } else {
            System.out.println("Usuario não encontrado");
        }
    }

    public void delete() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ID do fornecedor para a exclusão: ");
        int id = teclado.nextInt();
        if (fornecedorController.Delete(id)) {
            System.out.println("Fornecedor excluido com sucesso!");
        } else {
            System.out.println("Fornecedor não encontrado.");
        }
    }
    
    public void showMenu() { 
        Scanner teclado = new Scanner(System.in);
        while(true) {
            System.out.println("\nGESTÃO FORNECEDORES\n");
            System.out.println("1 - Adicionar fornecedor");
            System.out.println("2 - Listar todos os fornecedores");
            System.out.println("3 - Procurar por ID");
            System.out.println("4 - Procurar por rasão social");
            System.out.println("5 - Procurar por CNPJ");
            System.out.println("6 - Atualizar fornecedor");
            System.out.println("7 - Deletar fornecedor");
            System.out.println("8 - Sair\n");
            int opcao = teclado.nextInt();
            switch(opcao){
                case 1: 
                    add();
                    break;
                case 2:
                    getAll();
                    break;
                case 3:
                    getById();
                    break;
                case 4:
                    getByCodenome();
                    break;
                case 5:
                    getByCnpj();
                    break;
                case 6:
                    update();
                    break;
                case 7:
                    delete();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção invalida");
                    
            }
        }
    }
}
