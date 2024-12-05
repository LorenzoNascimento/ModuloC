package exemplocrud2;

import Control.UsuarioController;
import Model.DAO;
import View.UsuarioView;

/**
 *
 * @author Lorenzo
 */
public class ExemploCRUD {
    
    public static void main(String[] args) {
//        UsuarioDAO usuarioDAO = new UsuarioDAO();
//        UsuarioController usuarioController = new UsuarioController(usuarioDAO);
//        UsuarioView usuarioView = new UsuarioView(usuarioController);
//
//        usuarioView.showMenu();

        DAO.getConnection();
    }
}

























/*
    Do mesmo modo que criamos a gestão de usuários, agora faça a gestão de produtos e a gestão de fornecedores

    O cadastro de fornecedores deve possuir:
        ID
        Razão Social
        Nome Fantasia
        CNPJ

        Ações
        
Cadastrar X
Alterar X
Excluir X
Listar todos X
Listar por ID X
Consultar por Razão social
Consultar por CNPJ


O cadastro de produtos deve possuir:

    ID
    Nome
    Valor

    Ações:

Cadastrar X
Listar todos X
Alterar X
Excluir X
Listar por ID X
Consultar por nome X
Consultar por valor mínimo X
Consultar por valor máximo X
Consultar por valor entre -
 */
