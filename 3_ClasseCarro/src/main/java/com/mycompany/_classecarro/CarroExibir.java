package com.mycompany._classecarro;

/**
 *
 * @author Lorenzo
 */
public class CarroExibir {
    
    String marca;
    String modelo;
    int ano;
    boolean ligado;

    public CarroExibir(String marca, String modelo, int ano, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = ligado;
    }

    CarroExibir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public void apresentar() {
        System.out.println("Marca: " + c1.marca);
        System.out.println("Modelo: " + c1.modelo);
        System.out.println("Ano: " + c1.ano);
        System.out.println("O carro esta ligado? " + c1.ligado);
    }
}
