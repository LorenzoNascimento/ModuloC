package Control;

import Model.Usuario;
import Model.UsuarioDAO;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Lorenzo
 */
public class UsuarioController {

    private UsuarioDAO usuarioDAO;

    public UsuarioController(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    public void add(String nome, String usuario, String senha) {
        usuarioDAO.add(nome, usuario, senha);
    }

    public ArrayList<Usuario> getAll() {
        return usuarioDAO.getAll();
    }

    public Optional<Usuario> getById(int id) {
        return usuarioDAO.getById(id);
    }

    public ArrayList<Usuario> getByNome(String nome) {
        return usuarioDAO.getByNome(nome);
    }
    
    public boolean delete(int id) {
        return usuarioDAO.delete(id);
    }
    
    public boolean update (int id, String nome, String usuario, String senha){
        return usuarioDAO.update(id, nome, usuario, senha);
    }
}
