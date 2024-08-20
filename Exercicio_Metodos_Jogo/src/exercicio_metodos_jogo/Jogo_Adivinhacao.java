package exercicio_metodos_jogo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Jogo_Adivinhacao {

    // Metodo para iniciar jogo
    public static void iniciar_jogo() {
        System.out.println("Bem-vindo ao jogo de adivinhação");
        System.out.println("Tente adivinhar o numero em que estou pensando");
    }

//    Metodo para processar 
    public static int processarEntrada() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu palpite: ");
        return teclado.nextInt();
    }

//    Metodo para verificar se o jogo venceu 
    public static boolean verificarVencedor(int palpite, int numeroSecreto) {
        if (palpite == numeroSecreto) {
            System.out.println("Parabens! Voce acertou o numero");
            return true;
        } else if (palpite < numeroSecreto) {
            System.out.println("O numero e maior que" + palpite);
        } else {
            System.out.println("O numero e menor que" + palpite);
        }
        return false;
    }

    public static void main(String[] args) {
        
        iniciar_jogo();
        Random rd = new Random();
        
        int numeroSecreto = rd.nextInt(100);
        boolean venceu = false;
        
        while (!venceu) {
            int palpite = processarEntrada();
            venceu = verificarVencedor(palpite,numeroSecreto);
        }
        System.out.println("Obrigado por jogar!");
    }
}
