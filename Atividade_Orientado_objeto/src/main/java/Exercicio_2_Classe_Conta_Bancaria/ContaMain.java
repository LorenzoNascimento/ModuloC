package Exercicio_2_Classe_Conta_Bancaria;

/**
 *
 * @author Lorenzo
 */
public class ContaMain {

    public static void main(String[] args) {
        DadosConta dc = new DadosConta("asdadw21313", "Lorenzo");
        dc.status();
        dc.Depositar(123.40);

    }
}
