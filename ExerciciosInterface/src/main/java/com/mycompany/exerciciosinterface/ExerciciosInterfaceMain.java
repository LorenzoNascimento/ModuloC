package com.mycompany.exerciciosinterface;

/**
 *
 * @author Lorenzo
 */
public class ExerciciosInterfaceMain {

    public static void main(String[] args) {

        ControleRemoto c = new ControleRemoto();

//        c.desligar();
        c.ligar();
        c.ligarMudo();
        c.pause();
        c.play();
        c.maisVolume();
        c.maisVolume();
        c.menosVolume();
        c.abrirMenu();
        c.fecharMenu();
        

    }
}
