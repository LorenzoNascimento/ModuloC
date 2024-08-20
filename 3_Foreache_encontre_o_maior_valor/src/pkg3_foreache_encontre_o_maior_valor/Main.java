package pkg3_foreache_encontre_o_maior_valor;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numero = new ArrayList<>();
        int maior = 0;

//        Adicionando na lista os numeros
        Collections.addAll(numero, 14, 7, 9, 5, 2, 8);

//        Verificar qual é o maior numero
        for (int tela : numero) {
            if (tela > maior) {
                maior = tela;
            }
        }
//        Mostrar na tela o maior numero
        System.out.println("O Maior numero do Array e: " + maior);
    }

}
