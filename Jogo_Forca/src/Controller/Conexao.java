package Controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author Lorenzo
 */
public class Conexao {

    //Conectar com o MySQL
    private static final String url = "jdbc:mysql://localhost:3306/forca"; //Localização da tabela
    private static final String user = "root"; //Usuario
    private static final String password = "root"; //Senha

    public static Connection conn; 

    public static Connection getConexao() {
        
        //Tentar se conectar com o MySLQ
        try {
            if (conn == null) {

                conn = DriverManager.getConnection(url, user, password);
                return conn;
            } else {
                return conn;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
