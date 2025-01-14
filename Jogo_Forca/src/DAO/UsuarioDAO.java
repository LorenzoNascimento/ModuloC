package DAO;

import Controller.Conexao;
import Model.Usuario;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author Lorenzo
 */
public class UsuarioDAO {
    
    //Salvar os dados de login na tabela do MySQL
    public void cadastrarJogador(Usuario Usuario){
        
        String sql = "INSERT INTO forcalogin (NOME, USUARIO) VALUES (?, ?)"; //Comando para executar para salvar no MySQL
        
        PreparedStatement ps = null;
        
        //Salvar os dados em suas devidas posições
        try{
        ps = Conexao.getConexao().prepareStatement(sql);
        ps.setString(1, Usuario.getNome());
        ps.setString(2, Usuario.getUsuario());
        
        ps.execute();
        ps.close();
        
        } catch (SQLException e){
            e.printStackTrace();
        }
        
    }
    
}
