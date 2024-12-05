package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Lorenzo
 */
public class ProdutoDAO {
    
    public void add(String nome, Double valor) {
        String sql = "INSERT INTO produtos (nome, valor) VALUES(?,?)";
        try(
           Connection conn = DAO.getConnection();
           PreparedStatement stmt = conn.prepareStatement(sql)){   
                stmt.setString(1,nome);
                stmt.setDouble(2, valor);
                stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }              
    }
    
    public ArrayList<Produto> getAll(){
        ArrayList<Produto> produto = new ArrayList<>();
        String sql = "SELECT id, nome, valor FROM produtos";
        try(
                Connection conn = DAO.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)){                               

                    while(rs.next()){
                        Produto p = new Produto(rs.getInt("id"), rs.getString("nome"), 
                                                rs.getInt("valor")); //Não consegui deixar double porque da erro
                        produto.add(p);
                    }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return produto;
    }
    
    public Optional<Produto> getById(int id){
        String sql = "SELECT id, nome, valor FROM produtos WHERE id = ?";
        try(Connection conn = DAO.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();            
            if(rs.next()){
                Produto p = new Produto(rs.getInt("id"), rs.getString("nome"), 
                                        rs.getInt("Valor")); 
                return Optional.of(p);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return Optional.empty();
    }
    
    public ArrayList<Produto> getByNome(String nome){
        ArrayList<Produto> produto = new ArrayList<>();
        String sql = "SELECT id, nome, valor FROM produtos WHERE nome like(?)";      
        try(Connection conn = DAO.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, nome+"%");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Produto p = new Produto(rs.getInt("id"), rs.getString("nome"), 
                                        rs.getInt("valor")); 
                produto.add(p);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return produto;
    }
    
    //Implementar valor min, max e entre
    
        public boolean delete(int id){             
        String sql = "DELETE FROM produtos WHERE id = ?";
        try(Connection conn = DAO.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
        
            public boolean update(int id, String nome, Double valor){
        String sql = "UPDATE produtos SET nome = ?, valor = ? WHERE id = ?";
        try(Connection conn = DAO.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, nome);
            stmt.setDouble(2, valor);
            stmt.setInt(3, id);
            return stmt.executeUpdate() > 0;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
