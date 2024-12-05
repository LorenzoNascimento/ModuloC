package com.mycompany._classecarro;

/**
 *
 * @author Lorenzo
 */
public class App {

    public static void main(String[] args) {
        
     CarroExibir c1 = new CarroExibir();
     
     c1.marca = "Nissan";
     c1.modelo = "Silvia S13";
     c1.ano = 1998;
     c1.ligado = false;
     c1.apresentar();
    }
}
