package FornecedorDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.Optional;


/**
 *
 * @author Lorenzo
 */
public class FornecedorDAO {
    
    public void add(String nome, String usuario, String senha) {
        String sql = "INSERT INTO FORNECEDORES (nome, codenome, cnpj) VALUES(?,?,?)";
        try(
           Connection conn = DAO.getConnection();
           PreparedStatement stmt = conn.prepareStatement(sql)){   
                stmt.setString(1,nome);
                stmt.setString(2, usuario);
                stmt.setString(3, senha);
                stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }              
    }
    
    public ArrayList<Fornecedor> getAll() {
        ArrayList<Fornecedor> fornecedor = new ArrayList<Fornecedor>();
        String sql = "SELECT id, nome, codenome, cnpj FROM fornecedores";
        try(
                Connection conn = DAO.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)){
            
            while(rs.next()) {
                Fornecedor f = new Fornecedor(rs.getInt("id"), rs.getString("nome"), 
                                                rs.getString("usuario"),rs.getString("senha"));
                        fornecedor.add(f);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return fornecedor;
    }
        
    public Optional<Fornecedor> getById(int id){
        String sql = "SELECT id, nome, codenome, senha FROM usuario WHERE id = ?";
        try(Connection conn = DAO.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();            
            if(rs.next()){
                Fornecedor f = new Fornecedor(rs.getInt("id"), rs.getString("nome"), 
                                        rs.getString("codenome"),rs.getString("senha")); 
                return Optional.of(f);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return Optional.empty();
    }
    
    public ArrayList<Fornecedor> getByCodenome(String codenome){
        ArrayList<Fornecedor> fornecedor = new ArrayList<>();
        String sql = "SELECT id, nome, codenome, senha FROM fornecedores WHERE codenome like(?)";
        try(Connection conn = DAO.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, codenome+"%");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Fornecedor f = new Fornecedor(rs.getInt("id"), rs.getString("nome"), 
                                        rs.getString("codenome"),rs.getString("cnpj")); 
                fornecedor.add(f);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return fornecedor;
    }
    
    public ArrayList<Fornecedor> getByCnpj(String cnpj) {
        ArrayList<Fornecedor> fornecedor = new ArrayList<>();
        String sql = "SELECT id, nome, codenome, senha FROM fornecedores WHERE cnpj like(?)";
        try(Connection conn = DAO.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, cnpj+"%");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Fornecedor f = new Fornecedor(rs.getInt("id"), rs.getString("nome"), 
                                        rs.getString("codenome"),rs.getString("cnpj")); 
                fornecedor.add(f);
            }
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return fornecedor;
    }
    
    public boolean Update(int id, String nome, String codenome, String cnpj) {
        String sql = "UPDATE fornecedores SET nome = ?, codenome = ?, cnpj = ? WHERE id = ?";
        try(Connection conn = DAO.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, nome);
            stmt.setString(2, codenome);
            stmt.setString(3, cnpj);
            stmt.setInt(4, id);
            return stmt.executeUpdate() > 0;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
        public boolean Delete(int id){             
        String sql = "DELETE FROM fornecedores WHERE id = ?";
        try(Connection conn = DAO.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
