package pkg4_foreach_calcule_media;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Double> nota = new ArrayList<>(); // criando lista
        double media = 0, soma = 0; // variaveis

        Collections.addAll(nota, 8.75, 4.25, 9.50); //adicionanr a lista a nota

        for (Double tela : nota) { 
            soma = 8.75 + 4.25 + 9.50;//fazer a soma das notas
            media = soma / 3; //dividir para saber a media
            }
        System.out.println("A média do aluno é: " + media); //mostrar a nota na tela
    }

}
