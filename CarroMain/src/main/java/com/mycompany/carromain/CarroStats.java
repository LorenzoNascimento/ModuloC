package com.mycompany.carromain;

/**
 *
 * @author Lorenzo
 */
public class CarroStats {

    String marca;
    String modelo;
    int ano;
    boolean chave;

    public CarroStats(String marca, String modelo, int ano, boolean chave) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.chave = chave;
    }

    CarroStats() {
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

    public boolean isChave() {
        return chave;
    }

    public void setChave(boolean chave) {
        this.chave = chave;
    }
    public void apresentar(){
        System.out.println("Marca: " + c1.marca);
        System.out.println("Modelo: " + c1.modelo);
        System.out.println("Ano: " + c1.ano);
        System.out.println("O carro esta " + c1.chave);
    }
}
