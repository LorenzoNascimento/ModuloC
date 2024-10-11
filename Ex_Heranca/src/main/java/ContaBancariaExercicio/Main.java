package ContaBancariaExercicio;

/**
 *
 * @author Lorenzo
 */
public class Main {
    public static void main(String[] args) {
        
//        ContaCorrente
        ContaCorrente cc = new ContaCorrente(129832176, 218.24, 1500);
        System.out.println("Numero da conta: " + cc.getNumeroConta());
        System.out.println("Saldo: " + cc.getSaldo());
        System.out.println("Limite: " + cc.getLimite());
        System.out.println("\n");
        
//        ContaPoupanca
        ContaPoupaca cp = new ContaPoupaca(192737, 500, 10);
        System.out.println("Numero da conta: " + cp.getNumeroConta());
        System.out.println("Saldo: " + cp.getSaldo());
        System.out.println("Taixa de juros: " + cp.getTaixaJuros());
        System.out.println("\n");
        
//        ContaInvestimentos
        ContaInvestimentos ci = new ContaInvestimentos(112321231, 12500.00, 500);
        System.out.println("Numero da conta: " + ci.getNumeroConta());
        System.out.println("Saldo: " + ci.getSaldo());
        System.out.println("Investimentos: " + ci.getInvestimentos());
    }
    
}
