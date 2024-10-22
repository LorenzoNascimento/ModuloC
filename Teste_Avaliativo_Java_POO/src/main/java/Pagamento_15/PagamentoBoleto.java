package Pagamento_15;

/**
 *
 * @author Lorenzo
 */
public class PagamentoBoleto implements Pagamento{

    @Override
    public void efetuarPagamento() {
        System.out.println("Pagamento com boleto efetuado com sucesso!");
    }
    
}
