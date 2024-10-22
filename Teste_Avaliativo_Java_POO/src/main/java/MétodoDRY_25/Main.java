package MétodoDRY_25;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Triangulo t = new Triangulo(4);
        t.calcularArea();
    }
}

// Resposta: Nâo tendo que repetir os códigos diversas vezes e ficar reescrevendo, sendo assim é apenas colocar um extends
// para "herdar as funções de outro cógido"
