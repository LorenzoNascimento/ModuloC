package com.mycompany.carromain;

/**
 *
 * @author Lorenzo
 */
public class CarroMain {

    public static void main(String[] args) {
        CarroStats c1 = new CarroStats();
        c1.marca = "Nissan";
        c1.modelo = "Silvia S13";
        c1.ano = 1998;
        c1.chave = false;
        c1.apresentar();
    }
}
