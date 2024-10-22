package Midias;

/**
 *
 * @author Lorenzo
 */
public class Main {

    public static void main(String[] args) {

//        Musica
        Musica m = new Musica("Eyes", 230, "carinha", "algum album");
        System.out.println("Musica: " + m.getTitulo());
        System.out.println("Duração: " + m.getDuracao());
        System.out.println("Artista: " + m.getArtista());
        System.out.println("Album: " + m.getAlbum());
        System.out.println("\n");
        
//        Filme
        Filme f = new Filme("Carros", 1200, "Brian Fee e John Lasseter", "Animação");
        System.out.println("Filme: " + f.getTitulo());
        System.out.println("Duração: " + f.getDuracao());
        System.out.println("Diretor: " + f.getDuracao());
        System.out.println("Genero: " + f.getGenero());
        System.out.println("\n");

//        Jogo
        Jogo j = new Jogo("Valorant", 999, "PC", "+16");
        System.out.println("Jogo: " + j.getTitulo());
        System.out.println("Tempo: " + j.getDuracao());
        System.out.println("Plataforma: " + j.getPlataforma());
        System.out.println("Classificação: " + j.getClass());
    }
}
