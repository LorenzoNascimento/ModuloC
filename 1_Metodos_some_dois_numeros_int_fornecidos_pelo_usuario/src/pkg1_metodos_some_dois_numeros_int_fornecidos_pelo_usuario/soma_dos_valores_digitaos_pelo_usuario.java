package pkg1_metodos_some_dois_numeros_int_fornecidos_pelo_usuario;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class soma_dos_valores_digitaos_pelo_usuario {
 
   public static double soma(double resultado, double n1, double n2) {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Digite o primeiro numero");
       n1 = teclado.nextDouble();
       System.out.println("Digite o segundo numero");
       n2 = teclado.nextDouble();
       resultado = n1 + n2;
       return resultado;
}
    public static void main(String[] args) {
        double resultado;
        return resultado;
        System.out.println(resultado);
    }
}
