package EnergeticoMonster;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class POO {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Sabores de Monsters: \n1. Mango logo \n2. Ultra violet \n3. Absoltely Zero \n4. Original \n5. Dragon Tea");
        System.out.println("Digite o numero do sabor que você quer: ");
        int escolha = teclado.nextInt();
        Monster escolhido = escolherSabor(escolha);
        if (escolhido != null) {
            System.out.println("Você escolhu " + escolhido.getsabor() + "\n Valor: R$ " + escolhido.getvalor());
        }
    }
}
