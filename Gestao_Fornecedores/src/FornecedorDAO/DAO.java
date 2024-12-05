package FornecedorDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Lorenzo
 */
public class DAO {
    
    private static final String URL = "jdbc:mysql://localhost:3306/Fornecedor_CRUD";
    private static final String USER = "root";
    private static final String PSWD = "Lorenzo_98738038";
    
    
    public static Connection getConnection() {
        Connection connection = null;
        try{
            connection  = DriverManager.getConnection(URL, USER, PSWD);
        }catch(SQLException e){
            System.out.println("Erro ao conectar" + e.getMessage());
        }
        return connection;
    }
}
