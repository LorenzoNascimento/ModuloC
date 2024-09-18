package Monster;

/**
 *
 
@author Luis*/

import java.util.Scanner;

public class Energetico { // Renomeando MonsterClass para Energetico
    private String sabor;
    private double valor;

    public Energetico(String sabor, double valor) {
        this.sabor = sabor;
        this.valor = valor;
    }

    public String getSabor() { 
        return sabor;
    }

    public double getValor() { 
        return valor;
    }
}