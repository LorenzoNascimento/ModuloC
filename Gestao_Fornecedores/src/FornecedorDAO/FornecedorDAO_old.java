package FornecedorDAO;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Lorenzo
 */
public class FornecedorDAO_old {
    
    private static final ArrayList<Fornecedor> fornecedor = new ArrayList();
    private static int ultimoid = 1;
    
    public void add (String nome, String codenome, String cnpj ) {
        Fornecedor f = new Fornecedor (ultimoid++, nome, codenome, cnpj);
        fornecedor.add(f);
    }
    
    public ArrayList<Fornecedor> getAll() {
        return fornecedor;
    }
    
    public Optional<Fornecedor> getById(int id) {
        return fornecedor.stream().filter(fornecedor -> fornecedor.getId() == id).findFirst();
    }
    
    public ArrayList<Fornecedor> getByCodenome(String codenome) {
        ArrayList<Fornecedor> resposta = new ArrayList();
        for (Fornecedor u : fornecedor) {
            if (u.getCodenome().equalsIgnoreCase(codenome)) {
                resposta.add(u);
            }
        }
        return resposta;
    }
    
    public ArrayList<Fornecedor> getByCnpj(String cnpj) {
        ArrayList<Fornecedor> resposta = new ArrayList();
        for(Fornecedor f : fornecedor) {
            if(f.getCnpj().equalsIgnoreCase(cnpj)) {
                resposta.add(f);
            }
        }
        return resposta;
    }
    
    public boolean update(int id, String nome, String codenome, String cnpj) {
        Optional<Fornecedor> item = getById(id);
        if(item.isPresent()) {
            Fornecedor fornecedorNovo = item.get();
            fornecedorNovo.setNome(nome);
            fornecedorNovo.setCodenome(codenome);
            fornecedorNovo.setCnpj(cnpj);
            return true;
        }
        return false;
    }
    
    public boolean delete (int id) {
        return fornecedor.removeIf(fornecedor -> fornecedor.getId() == id);
    }
}
