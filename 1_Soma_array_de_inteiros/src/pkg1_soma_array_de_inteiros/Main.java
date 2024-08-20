package pkg1_soma_array_de_inteiros;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); //lista
        int soma = 0; //variaveis
        Collections.addAll(numeros, 6, 9, 8, 3); //adicionar a lista

        for (int tela : numeros) { //somar os numeros
            soma = 6 + 9;
            soma += 8 + 3;
        }
        System.out.println("A soma dos elementos do Array e de: " + soma); //mostrar na tela o resultado
    }

}
