package FornecedorDAO;

/**
 *
 * @author Lorenzo
 */
public class Fornecedor {
    
    private int id;
    private String nome;
    private String codenome;
    private String cnpj;

    public Fornecedor(int id, String nome, String codenome, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.codenome = codenome;
        this.cnpj = cnpj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodenome() {
        return codenome;
    }

    public void setCodenome(String codenome) {
        this.codenome = codenome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
