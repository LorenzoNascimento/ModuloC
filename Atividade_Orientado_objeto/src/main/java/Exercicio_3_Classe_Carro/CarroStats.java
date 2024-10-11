package Exercicio_3_Classe_Carro;

/**
 *
 * @author Lorenzo
 */
public class CarroStats {

    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    public CarroStats(String marca, String modelo, int ano, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado();

    }

    public void status() {
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Ligado? " + this.getLigado());
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

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligado() {
        this.ligado = true;
    }

    public void desligado() {
        this.ligado = false;
    }

}
