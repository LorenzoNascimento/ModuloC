package Model;

/**
 *
 * @author Lorenzo
 */
public class JogoVariavel {
   
   private String id;
   private String palavra = "a";
   private String chute;
   private char letras;
   private static int tentativaLabel = 5;
   
   public int tentativamenos(){
       tentativaLabel =- 1;
       return tentativaLabel;
   }
    public int getTentativaLabel() {
        return tentativaLabel;
    }

    public void setTentativaLabel(int tentativaLabel) {
        this.tentativaLabel = tentativaLabel;
    }
   
   
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

    /**
     * @return the tentativaLabel
     */
    public int tentativaLabel() {
        return tentativaLabel;
    }

    /**
     * @param tentativaLabel the tentativaLabel to set
     */
    public void tentativaLabel(int tentativaLabel) {
        this.tentativaLabel = tentativaLabel;
    }
    
    public void diminuirTentativas(){
        if(tentativaLabel > 0){
            tentativaLabel--;
        }
    }

}