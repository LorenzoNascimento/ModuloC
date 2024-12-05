package Control;

import Model.Produto;
import Model.ProdutoDAO;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Lorenzo
 */
public class ProdutoController {
    
    private ProdutoDAO produtoDAO;
    
    public ProdutoController(ProdutoDAO produtoDAO) {
        this.produtoDAO = produtoDAO;
    }
    
    public void add(String nome, Double valor){
        produtoDAO.add(nome, valor);
    }
    
    public ArrayList<Produto> getAll(){
        return produtoDAO.getAll();
    }
    
    public Optional<Produto> getById(int id){
        return produtoDAO.getById(id);
    }
    
    public ArrayList<Produto> getByName(String nome){
        return produtoDAO.getByNome(nome);
    }
    
//    public ArrayList<Produto> getByValorMin(double valor) {
//        return produtoDAO.getByValorMin(valor);
//    }
//    
//    public ArrayList<Produto> getByValorMax(double valor) {
//        return produtoDAO.getByValorMax(valor);
//    }
    
//    public ArrayList<Produto> getByValorEntre(double valor) {
//        return produtoDAO.getByValorEntre(valor);
//    }
    
    public boolean update(int id,String nome,double valor){
        return produtoDAO.update(id, nome, valor);
    }
    
    public boolean delete(int id){
        return produtoDAO.delete(id);
    }
}
