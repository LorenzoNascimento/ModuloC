package DnaAnimal;

/**
 *
 * @author Lorenzo
 */
public class DnaAnimal {

    public static void main(String[] args) {

        //Mamifero
        Mamifero m = new Mamifero();
        m.setCorPelo("Marrom");
        m.setIdade(4);
        m.setMembros(2);
        m.setPeso(72.2f);

        //Cachorro
        SnoopDog c = new SnoopDog();
        c.abanarRabo();
        c.pedirComida();
        c.alimentar();
        c.locomover();
        c.emitirSom();

        //Canguru Jack
        Canguru_Jack cj = new Canguru_Jack();
        cj.usarBolsa();
        cj.lutarBoxe();
        cj.alimentar();
        cj.locomover();
        cj.emitirSom();

        //Reptil
        Repteis r = new Repteis();
        r.setCorEscama("Verde");
        r.alimentar();
        r.emitirSom();
        r.locomover();

        //Cobra
        Cobra co = new Cobra();
        co.corEscamaCobra();
        co.locomover();
        co.alimentar();
        co.emitirSom();

        //Tartaruga
        Tartaruga t = new Tartaruga();
        t.alimentar();
        t.emitirSom();
        t.locomover();
        t.nadar();

        //Perola do Bob Esponja (Baleia)
        PerolaBaleia pb = new PerolaBaleia();
        pb.alimentar();
        pb.emitirSom();
        pb.soltaAgua();
        pb.locomover();

        //Peixe
        Peixes p = new Peixes();
        p.fazerBolhas();
        p.setBarbatana("Barbatana grande");
        p.setCorEscama("Azul");
        p.setDentes("Dentes grandes");

        //Ave
        Aves a = new Aves();
        a.fazerNinho();
        a.getCorPena();
        a.locomover();
        a.emitirSom();
        a.alimentar();

        //Pigieot
        Pigieot pi = new Pigieot();
        pi.bicada();
        pi.locomover();
        pi.alimentar();
        pi.emitirSom();
    }

}
