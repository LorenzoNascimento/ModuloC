package conexaomysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lorenzo
 */
public class ConexaoMySQL {
    //Variaveis para os detalhes de conexão
    private static final String url = "jdbc:mysql://localhost:3306/pub_bar";
    private static final String user = "root";
    private static final String password = "";

    //Metodo principal para testar a conexão
    public static void main(String[] args) {
        Connection conexao = null;

        try {
            //1. Estabelecer a conexão com o BD
            conexao = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão estabelecida com sucesso");

            //Executar uma consulta para obter os dados
            String sql = "SELECT * FROM usuarios;";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();

            //Exibir os dados recuperados/consultados
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nome = resultado.getString("nome");
                String email = resultado.getString("email");
                System.out.println("ID: " + id + "\nNome: " + nome + "\nEmail: " + email);
            }

            //Fechar os resursos
            resultado.close();
            ps.close();
        } catch (SQLException error) {
            System.out.println("Erro ao conectar ao banco de dados");
            error.printStackTrace();
        } finally {
            //Certificar de fechar a conexão
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException error) {
                    error.printStackTrace();
                }
            }
        }

    }

}
