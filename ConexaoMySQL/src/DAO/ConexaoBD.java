package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lorenzo
 */
public class ConexaoBD {
    //Variaveis para os detalhes de conexão

    private static final String url = "jdbc:mysql://localhost:3306/pub_bar";
    private static final String user = "root";
    private static final String password = "Lorenzo_98738038";

    public Connection conectar() {
        try {
            return DriverManager.getConnection(url, user, password);
        }catch (SQLException e){
            System.out.println("Erro ao conectar oa bd");
            e.printStackTrace();
            return null;
        }
    }
}
