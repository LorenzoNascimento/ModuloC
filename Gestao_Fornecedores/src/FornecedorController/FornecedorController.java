package FornecedorController;

import FornecedorDAO.Fornecedor;
import FornecedorDAO.FornecedorDAO;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Lorenzo
 */
public class FornecedorController {
    
    private FornecedorDAO fornecedorDAO;
    
    public FornecedorController(FornecedorDAO fornecedorDAO) {
        this.fornecedorDAO = fornecedorDAO;
    }

    public void add(String nome, String codenome, String cnpj){
        fornecedorDAO.add(nome, codenome, cnpj);
    }
    
    public ArrayList<Fornecedor> getAll() {
        return fornecedorDAO.getAll();
    }
    
    public Optional<Fornecedor> getById(int id){
        return fornecedorDAO.getById(id);
    }
    
    public ArrayList<Fornecedor> getByCodenome(String codenome){
        return fornecedorDAO.getByCodenome(codenome);
    }
    
    public ArrayList<Fornecedor> getByCnpj(String cnpj) {
        return fornecedorDAO.getByCnpj(cnpj);
    }
    
    public boolean Update(int id, String nome, String codenome, String cnpj){
        return fornecedorDAO.Update(id, nome, codenome, cnpj);
    }
    
    public boolean Delete (int id) {
        return fornecedorDAO.Delete(id);
    }
}
