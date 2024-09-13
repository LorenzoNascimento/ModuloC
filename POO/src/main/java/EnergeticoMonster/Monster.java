package EnergeticoMonster;

/**
 *
 * @author Lorenzo
 */
public class MonsterClass {

    public static MonsterClass escolhersabor(int escolha) {
        //Criação de um objeto para cada sabor

        Monster mangoLoco = new Monster("Mango Loco", 9.80);
        Monster ultraViolet = new Monster("Ultra Violet", 12.00);
        Monster absolutelyZero = new Monster("Absolutely Zero", 9.99);
        Monster original = new Monster("Original", 8.00);
        Monster dragonTea = new Monster("Dragon Tea", 9.80);
   
        // declaração de um objeto monster para armazenar a escolhar do usuario
        Monster escolhido;
        
        switch(escolha){
            case 1: 
                escolhido = mangoLoco;
                break;
            case 2:
                escolhido = ultraViolet;
                        break;
            case 3:
                escolhido = absolutelyZero;
                break;
            case 4:
                escolhido = original;
                break;
            case 5:
                escolhido = dragonTea;
                break;
            default: 
                System.out.println("Opção invalida");
                return null;
        }
        return escolhido;
    }

}
