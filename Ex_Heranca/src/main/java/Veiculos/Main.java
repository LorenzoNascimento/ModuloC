package Veiculos;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
                Carro meuCarro = new Carro("Fiat", "Uno", 2024, 4);
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAno());
        System.out.println("Portas: " + meuCarro.getNumPortas());

    }
    
}
