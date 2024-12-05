package Model;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Lorenzo
 */
public class ProdutoDAO_old {

    private static final ArrayList<Produto> produto = new ArrayList();
    private static int ultimoId = 1;

    public void add(String nome, double valor) {
        Produto p = new Produto(ultimoId++, nome, valor);
        produto.add(p);

    }

    public ArrayList<Produto> getAll() {
        return produto;
    }

    public Optional<Produto> getById(int id) {
        return produto.stream().filter(produto -> produto.getId() == id).findFirst();
    }
    
    public ArrayList<Produto> getByName(String nome) {
        ArrayList<Produto> resposta = new ArrayList();
        for(Produto p : produto){
            if(p.getNome().equalsIgnoreCase(nome)){
                resposta.add(p);
            }
        }
        return resposta;
    }
    
    public ArrayList<Produto> getByValorMin(double valor) {
        ArrayList<Produto> respostaValorMin = new ArrayList();
        for(Produto p : produto){
            if(p.getValor() < p.getValor() && p.getValor() > 0) {
                respostaValorMin.add(p);
            }
        }
        return respostaValorMin;
    }
    
    public ArrayList<Produto> getByValorMax(double valor){
        ArrayList<Produto> respostaValorMax = new ArrayList();
        for(Produto p : produto) {
            if(p.getValor() > p.getValor() && p.getValor() > 0) {
                respostaValorMax.add(p);
            }
        }
        return respostaValorMax;
    }
    
//    public ArrayList<Produto> getByValorEntre(double valor) { 
//        ArrayList<Produto> respostaValorEntre = new ArrayList();
//        for(Produto p : produto) {
//            if(p.getValor() > p.getValor()) {
//                respostaValorEntre.add(p);
//            }
//        }
//        return respostaValorEntre;
//    }
    
    public boolean update(int id, String nome, double valor) {
        Optional<Produto> item = getById(id);
        if (item.isPresent()) {
            Produto produtoNovo = item.get();
            produtoNovo.setNome(nome);
            produtoNovo.setValor(valor);
            return true;
        }
        return false;
    }
    
    public boolean delete(int id){
        return produto.removeIf(produto -> produto.getId() == id);
    }
}
