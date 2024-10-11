package com.mycompany.atividade_orientado_objeto;

/**
 *
 * @author Lorenzo
 */
public class Atividade_Orientado_objeto {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa ("Lorenzo", 17, 1.79);
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Altura: " + p1.getAltura());

    }
}
