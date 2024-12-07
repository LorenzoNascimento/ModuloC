package Model;

import View.ChutePalavra;
import java.io.FileWriter;

/**
 *
 * @author Lorenzo
 */
public class JogoVariavel {
   protected String id;
   protected String palavra;

    public JogoVariavel(String id, String palavra) {
        super();
        this.id = id;
        this.palavra = palavra;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

}