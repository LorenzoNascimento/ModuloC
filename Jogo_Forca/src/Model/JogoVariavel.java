package Model;

/**
 *
 * @author Lorenzo
 */
public class JogoVariavel {
   private String id;
/* Palavras para o jogo da forca:
   
 - ALGORITIMO
 - CODIGO
 - VARIAVEL
 - FUNÇAO
 - LOOP
 - DEPURAÇAO
 - JAVA
 - FRAMEWORK
 - LINGUAGEM
 - BANCO DE DADOS
   
*/
   
   private String palavra = "LOOP";
   private String chute;
   private char letras;
   
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the palavra
     */
    public String getPalavra() {
        return palavra;
    }

    /**
     * @param palavra the palavra to set
     */
    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    /**
     * @return the letras
     */
    public char getLetras() {
        return letras;
    }

    /**
     * @param letras the letras to set
     */
    public void setLetras(char letras) {
        this.letras = letras;
    }

    /**
     * @return the chute
     */
    public String getChute() {
        return chute;
    }

    /**
     * @param chute the chute to set
     */
    public void setChute(String chute) {
        this.chute = chute;
    }

}