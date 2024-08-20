package exercicio_metodos_jogo;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class ConversorTemperatura {

    //Metodo para converter Celsius para Fahrenheit
    public static double celsiusFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius");
        double celcius = teclado.nextDouble();

        double fahrenheit = celsiusFahrenheit(celcius);
        
        System.out.println(celcius + "C equivalente a " + fahrenheit + "F");
        teclado.close();
    }
}
