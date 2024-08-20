package com.mycompany._copiar_para_outro_array_list;
import java.util.ArrayList;
/**
 *
 * @author Lorenzo
 */
public class App {

    public static void main(String[] args) {
        
//        Criando as das listas para copiar os nomes e passar para a outra
        ArrayList<String> animais = new ArrayList<>();
        ArrayList<String> animaiscopia = new ArrayList<>();
        
//        Adicionando os anumais na lista
        animais.add("Porco");
        animais.add("Vaca");
        animais.add("Cavalo");
        animais.add("Ovelha");
        
//        Copiar a lista animais para a animaiscopia
        animaiscopia.addAll(animais);
        
//        Imprimir os nomes na tela
        for(String tela : animaiscopia){
            System.out.println(tela);
        }
    }
}
