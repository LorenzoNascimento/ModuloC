package Carro_3;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {

        Carro c = new Carro(4, 4, true);
        System.out.println("O carro tem " + c.getNumPortas() + " portas.");
        System.out.println("O carro tem " + c.getNumRodas() + " rodas.");
        if(c.getParabrisa() == true){
            System.out.println("O carro tem parabrisa! ");
        }else{
            System.out.println("O carro está sem parabrisa! ");
        }
        
//        Herdar uma função que é indicar o numero de portas que tem o carro de outra classe para caso
//        voce fassa com mais de um veiculo nao tenha que criar diversos codidos para saber a quantia de portas
//        que um  carro tem e assim deixando seu código mais organizado e facil de entender.
   }
}
