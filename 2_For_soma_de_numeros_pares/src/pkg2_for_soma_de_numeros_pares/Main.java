package pkg2_for_soma_de_numeros_pares;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {

        double soma = 0;

        for (int i = 0; i <= 20; i++) { // saber se o numero é impar ou par
            if (i % 2 != 0) { //Se for para somar ele na variavel "soma"
                soma += i; //somar
            }
        }
        System.out.println(soma); //informar o resultado ao usuario
    }

}
