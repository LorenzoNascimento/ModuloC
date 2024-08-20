package pkg12_removendo_numeros_pares;

import java.util.Collections;
import java.util.HashSet;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {

//        Criar lista
        HashSet<Integer> numeros = new HashSet<>();

//        Colocar numeros na lista
        Collections.addAll(numeros, 2, 3, 4, 5, 6, 7, 8);
        
//        Criando contador
int pares = 0,impares = 0;

//        Loop for para conferir cada numero para saber se é impar ou par
        for (int conta : numeros){
            if (conta % 2 == 0){ //saber se é impar ou par
                pares++;
            }else {
                impares++;
            }
        
        }
//        Mostrar quantia de pares e impares para o usuario
        System.out.println("Ha " + pares + " numeros pares e " + impares + " numeros impares");
    }

}
