package Veiculos;

/**
 *
 * @author Lorenzo
 */
public class Caminhao extends Veiculo{
    
    private int capacidadeCarga = 10000;
    private int rodas = 10;
    private int portas = 2;
    
    public Caminhao(String marca, String modelo, int ano, int rodas, int capacidadeCarga, int portas){
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
        this.rodas = rodas;
        this.portas = portas;
    }
    
}
