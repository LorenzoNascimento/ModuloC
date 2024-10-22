package ContaBancaria_2;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {

        ContaBancaria c = new ContaBancaria("1233131", "Lorenzo", 200);
        
        System.out.println("O numero da conta é: " + c.getNumeroConta());
        System.out.println("O titular da conta é: " + c.getTitular());
        System.out.println("Saldo atual é de: " + c.getSaldo());
        c.Depositar(150.25);
    }
}
