package Model;

import View.ChutePalavra;
import java.io.FileWriter;

/**
 *
 * @author Lorenzo
 */
public class JogoVariavel {
   private String id;
   private String palavra;
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



}