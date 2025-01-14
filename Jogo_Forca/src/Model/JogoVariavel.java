package Model;

/**
 *
 * @author Lorenzo
 */
public class JogoVariavel {

    private String id;

/* Palavras para o jogo da forca:
   
Abstraçao
Algoritmo
API
Arquitetura
Arquivo
Array
ArrayList
Banco de Dados
BigDecimal
Branch
Classe
ClassCastException
Cliente
Compilaçao
Compilador
Commit
Conexao
Construtor
Console
Condicional
Debug
Deserialization
Enum
Entrada
Exceçao
Eclipse
Exceçao
File
Framework
Funçao
Git
Gradle
HashMap
Herança
Hibernate
IDE
Instancia
Interface
JDK
Java
JavaFX
JPA
JSP
JUnit
JSON
Lambda
List
LinkedList
Loop
Map
Maven
Merge
Microservices
Metodo
NullPointerException
Object
Objeto
POO
Parametro
Persistancia
Polimorfismo
Passiencia
Performance
Pull
Recursao
Refatoraçao
Reflection
Repositario
Retorno
REST
Scala
Set
Sincronizaçao
Servidor
Servlet
Sintaxe
SQL
Stack
Stream
String
Spring
Swing
Teste
TestUnit
Thread
Tipagem
Tomcat
Variável
WebSocket
XML
Queue
Socket
Serialization
SQLException
Stack
Reflection
Maven
   
*/
    
    //Cole alguma das palavras aqui para iniciar o jogo
    private String palavraCb = "Array";
    private String chute;
    private static int tentativaLabel = 10;

    public static int getTentativaLabel() {
        return tentativaLabel;
    }

    public static void setTentativaLabel(int tentativaLabel) {
        JogoVariavel.tentativaLabel = tentativaLabel;
    }

    public String getPalavraCb() {
        return palavraCb;
    }

    public void setPalavraCb(String palavraCb) {
        this.palavraCb = palavraCb;
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
    
    public void tentativaLabel(int tentativaLabel) {
        this.tentativaLabel = tentativaLabel;
    }
    
    public void diminuirTentativas(){
        if(tentativaLabel > 0){
            tentativaLabel--;
        }
    }

}
