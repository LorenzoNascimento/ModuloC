package com.mycompany.gestao_produtos;

import Control.ProdutoController;
import Model.DAO;
import Model.ProdutoDAO_old;
import View.ProdutoView;

/**
 *
 * @author Lorenzo
 */
public class Gestao_produtos {

    public static void main(String[] args) {

//        ProdutoDAO_old produtoDAO = new ProdutoDAO_old();
//        ProdutoController produtoController = new ProdutoController(produtoDAO);
//        ProdutoView produtoView = new ProdutoView(produtoController);
//        
//        produtoView.showMenu();
        DAO.getConnection();
    }
}
