package Exercicio_2_Animal;

/**
 *
 * @author Lorenzo
 */
public class AnimalComandos implements AnimalSons {
        
        private String emitirSom;
        private String Cachorro;
        private String Gato;
        private String Passaro;

        public AnimalComandos(String emitirSom, String Cachorro, String Gato, String Passaro) {
            this.emitirSom = emitirSom;
            this.Cachorro = Cachorro;
            this.Gato = Gato;
            this.Passaro = Passaro;
        }

        public String getEmitirSom() {
            return emitirSom;
        }

        public void setEmitirSom(String emitirSom) {
            this.emitirSom = emitirSom;
        }

        public String getCachorro() {
            return Cachorro;
        }

        public void setCachorro(String Cachorro) {
            this.Cachorro = Cachorro;
        }

        public String getGato() {
            return Gato;
        }

        public void setGato(String Gato) {
            this.Gato = Gato;
        }

        public String getPassaro() {
            return Passaro;
        }

        public void setPassaro(String Passaro) {
            this.Passaro = Passaro;
        }

        @Override
        public void emitirSom() {
            
        }

        @Override
        public void Cachorro() {
            System.out.println("Au");
        }

        @Override
        public void Gato() {
            System.out.println("Miau");
        }

        @Override
        public void Passaro() {
            System.out.println("Piu");
        }
        
    }
