package Controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author Lorenzo
 */
public class Conexao {
    
    private static final String url = "jdbc:mysql://localhost:3306/Forca";
    private static final String user = "root";
    private static final String password = "";
    
    private static Connection conexao;
    
    public static Connection getConexao(){
        if(conexao == null) {
            try{
                //Carregar driver JBDC para mysql
                Class.forName("com.mysql.cj.jdbc.Driver");
                conexao = DriverManager.getConnection(url,user,password);
                conexao.setAutoCommit(false);
            }catch(ClassNotFoundException | SQLException e){
                System.out.println("Erro ao conectar ao banco de dados" + e.getMessage());
                e.printStackTrace();
            }
        }
        return conexao;
    }
}
