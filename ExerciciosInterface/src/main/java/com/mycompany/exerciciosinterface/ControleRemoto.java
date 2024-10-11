package com.mycompany.exerciciosinterface;

/**
 *
 * @author Lorenzo
 */
public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean passandoPrograma;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.passandoPrograma = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getPassandoPrograma() {
        return passandoPrograma;
    }

    public void setPassandoPrograma(boolean passandoPrograma) {
        this.passandoPrograma = passandoPrograma;
    }

    //Metodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está passando algum programa? " + this.getPassandoPrograma());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("\nFechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 10);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 10);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && (this.getPassandoPrograma())) {
            this.setPassandoPrograma(true);
        } else {
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getPassandoPrograma()) {
            this.setPassandoPrograma(false);
        } else {
            System.out.println("Não conseguir pausar");
        }
    }
}
