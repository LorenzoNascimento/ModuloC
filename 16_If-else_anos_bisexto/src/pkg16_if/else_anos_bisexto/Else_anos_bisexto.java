package pkg16_if.else_anos_bisexto;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Else_anos_bisexto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ano = 0;
        System.out.println("Inforeme os ultimos dois numeros do ano ");
        ano = teclado.nextInt();
        
        if (ano * 4 != 0){
            System.out.println("O ano é bi-sexto");
        }else { 
            System.out.println("O ano não é bi-sexto");
        }
    }
    
}
