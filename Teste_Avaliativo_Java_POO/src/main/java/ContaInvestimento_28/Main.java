package ContaInvestimento_28;

/**
 *
 * @author Lorenzo
 */
public class Main {
        public static void main(String[] args) {
        
        ContaInvestimento ci = new ContaInvestimento("Lorenzo", "62135", 5200);
        System.out.println("Titular: " + ci.getTitular());
        System.out.println("Numero da conta: " + ci.getNumeroConta());
        System.out.println("Saldo anterior: " + ci.getSaldo());
        ci.renda(0.02);
        
    }
}
