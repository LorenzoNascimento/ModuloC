package pkg6_array_maior_que_10;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<>(); //lista
    int count=0; //variavel
    
    Collections.addAll(numeros, 4,7,9,10,22,124,62,7); //adicionar numeros a lista
    
    for(int tela : numeros){ //contar quantos numeros sao maior que 10
        if (tela > 10){
            count++;
        }
    }
        System.out.println("Ha " + count + " numeros maior que 10."); //mostrar ao usuario
    }
    
}
