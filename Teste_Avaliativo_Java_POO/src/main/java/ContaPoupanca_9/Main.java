package ContaPoupanca_9;

/**
 *
 * @author Lorenzo
 */
public class Main {
    public static void main(String[] args) {
        
        ContaPoupanca cp = new ContaPoupanca("Lorenzo", "213231", 10200);
        System.out.println("Titular: " + cp.getTitular());
        System.out.println("Numero da conta: " + cp.getNumeroConta());
        System.out.println("Saldo anterior: " + cp.getSaldo());
        cp.renda(0.01);
        
    }
}
