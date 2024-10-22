package Pagamento_15;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {

//        Pix
        PagamentoPix pp = new PagamentoPix();
        pp.efetuarPagamento();
        System.out.println("\n");

//        Boleto
        PagamentoBoleto pb = new PagamentoBoleto();
        pb.efetuarPagamento();
    }
}
