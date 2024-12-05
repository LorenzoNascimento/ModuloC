package View;

import Control.ProdutoController;
import Model.Produto;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class ProdutoView {

    private ProdutoController produtoController;

    public ProdutoView(ProdutoController produtoController) {
        this.produtoController = produtoController;
    }

    public void add(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Valor: ");
        double valor = teclado.nextDouble();
        produtoController.add(nome, valor);
    }
    
    public void getAll() {
        for (Produto p : produtoController.getAll()) {
            System.out.print("ID: ");
            System.out.print(p.getId() + "\t");
            System.out.print("Nome: ");
            System.out.print(p.getNome() + "\t");
            System.out.print("Valor: ");
            System.out.println(p.getValor() + "\t");
        }
    }

    public void getById() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ID: ");
        int id = teclado.nextInt();
        Optional<Produto> p = produtoController.getById(id);
        p.ifPresentOrElse(
                ps -> System.out.print("ID: " + ps.getId() + "\tNome: " + ps.getNome() + "\tValor: " + ps.getValor()),
                () -> System.out.println("Não encontrado"));
    }

    public void getByName() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome em que deseja procurar: ");
        String nome = teclado.nextLine();
        ArrayList<Produto> resposta = produtoController.getByName(nome);
        if (resposta.isEmpty()) {
            System.out.println("Nenhum produto com este nome encontrado. ");
        } else {
            for (Produto p : resposta) {
                System.out.print("ID: ");
                System.out.print(p.getId() + "\t");
                System.out.print("Nome: ");
                System.out.print(p.getNome() + "\t");
                System.out.print("Valor: ");
                System.out.print(p.getValor() + "\t");
            }
        }
    }

//    public void getByValorMin() {
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Digite o valor minimo: ");
//        double valor = teclado.nextDouble();
//        ArrayList<Produto> resposta = produtoController.getByValorMin(valor);
//        if (resposta.isEmpty()) {
//            System.out.println("Nenhum valor encontrado. ");
//        } else {
//            for (Produto p : resposta) {
//                System.out.print("ID: ");
//                System.out.print(p.getId() + "\t");
//                System.out.print("Nome: ");
//                System.out.print(p.getNome() + "\t");
//                System.out.print("Valor: ");
//                System.out.print(p.getValor() + "\t");
//            }
//        }
//    }
//    
//    public void getByValorMax() {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite o valor maximo");
//        double valor = teclado.nextDouble();
//        ArrayList<Produto> resposta = produtoController.getByValorMax(valor);
//        if(resposta.isEmpty()){
//            System.out.println("Nenhum valor encontrado");
//        }else{
//            for(Produto p : resposta) {
//                System.out.println("ID: ");
//                System.out.println(p.getId() + "\t");
//                System.out.println("Nome: ");
//                System.out.println(p.getNome() + "\t");
//                System.out.println("Valor: ");
//                System.out.println(p.getValor() + "\t");
//            }
//        }
//    }
    
    public void getByValorEntre() {
    Scanner teclado = new Scanner(System.in);
    
        System.out.println("Digite o valor maximo.");
        double vmax = teclado.nextInt();
        System.out.println("Digite o valor minimo");
        double vmin = teclado.nextInt();
    }
        
    public void update() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ID: ");
        int id = teclado.nextInt();
        teclado.skip("\\R");
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Valor: ");
        double valor = teclado.nextDouble();
        if (produtoController.update(id, nome, valor)) {
            System.out.println("Usuario atualizado com sucesso!");
        } else {
            System.out.println("Usuario não encontrado");
        }
    }

    public void delete() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("ID do produto para exclusão: ");
        int id = teclado.nextInt();
        if (produtoController.delete(id)) {
            System.out.println("Produto excluido com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
    
    public void showMenu() {
        Scanner teclado = new Scanner(System.in);
        
        while(true){
            System.out.println("\nGESTÃO DE PRODUTOS\n");
            System.out.println("1 - Adicionar um produto.");
            System.out.println("2 - Mostrar todos os produtos");
            System.out.println("3 - Procurar produto por id");
            System.out.println("4 - Procurar produto por nome");
            System.out.println("5 - Procurar produto por valor minimo");
            System.out.println("6 - Procurar produto por valor maximo");
            System.out.println("7 - Procurar produto por valor medio");
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
                getByName();
                break;
            case 5: 
//                getByValorMin();
                break;
            case 6:
//                getByValorMax();
                break;
            case 7:
                getByValorEntre();
                            break;
            case 8:
                System.exit(0);
            default:
                System.out.println("Opção invalida.");
        }
        }
    }
    
}
