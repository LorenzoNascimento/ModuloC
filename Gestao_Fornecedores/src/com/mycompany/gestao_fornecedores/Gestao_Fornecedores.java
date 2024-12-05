package com.mycompany.gestao_fornecedores;

import FornecedorDAO.DAO;

/**
 *
 * @author Lorenzo
 */
public class Gestao_Fornecedores {

    public static void main(String[] args) {

//        FornecedorDAO_old fornecedorDAO = new FornecedorDAO_old();
//        FornecedorController fornecedorController = new FornecedorController(fornecedorDAO);
//        FornecedorView fornecedorView = new FornecedorView(fornecedorController);
//        
//        fornecedorView.showMenu();
        DAO.getConnection();
    }
}
