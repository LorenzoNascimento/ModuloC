package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lorenzo
 */
public class InserirUsuario {

    public void inserir(String nome, String email) {
        ConexaoBD conexaoBD = new ConexaoBD();
        Connection conexao = conexaoBD.conectar();

        if (conexao != null) {
            //Linha de comando usando MySQL
            String sql = "INSERT INTO usuarios (nome,email) VALUES (?,?)";
            
            //Linha de comando usando Java
            /*System.out.println(
                    """
                    ID: %d
                    Nome: %s
                    Email: %s
                    """
                     ,nome, email));*/
            
//            try(PreparedStatement ps = conexao.prepareStatement(sql)){
//                ps.setString(1, nome);
//                ps.setString(2, email);
//                ps.execuuteUpdate();
//                System.out.println("Usuario");
//            }catch(SQLException e){
//                System.out.println("Erro ao inserir Usuário");   
//                e.printStackTrace();
//            }finally{
//                try{conexao.close();
//                }catch(SQLException e){
//                    e.printStackTrace();
//                }
//            }
        }
    }
}
