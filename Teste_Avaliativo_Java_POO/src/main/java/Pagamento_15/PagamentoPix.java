package Pagamento_15;

/**
 *
 * @author Lorenzo
 */
public class PagamentoPix implements Pagamento{

    @Override
    public void efetuarPagamento() {
        System.out.println("Pagamento por pix efetuado com sucesso!");
    }
    
}
