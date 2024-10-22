package EncapsulamentoConta_13;

/**
 *
 * @author Lorenzo
 */
public class Main {
    public static void main(String[] args) {
                ContaCorrente c = new ContaCorrente("621214", "Lorenzo", 150);
        
        System.out.println("O numero da conta é: " + c.getNumeroConta());
        System.out.println("O titular da conta é: " + c.getTitular());
        System.out.println("Saldo atual é de: " + c.getSaldo());
        c.Depositar(150.25);
    }
    
//    É o saldo definido como PRIVATE para ficar seguro e para ninguem que va usar a parte visual do programa ou
//    mecha em alguma parte dos codigos que nao mecha diretamente nele, nâo tenha acesso e ele fique seguro
}
