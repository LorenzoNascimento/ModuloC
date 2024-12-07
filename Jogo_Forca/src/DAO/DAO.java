package DAO;

import Controller.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class DAO {

    private static PreparedStatement pst = null;
    private static ResultSet rs = null;

    private static String SALVAR_PALAVRA = "INSERT INTO forcapalavra (id, palavra) values (null,?)";
    

    }

