package com.mycompany.atividade_orientado_objeto;

/**
 *
 * @author Lorenzo
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    private double altura;
    
    public Pessoa (String nome,int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int i){
        this.idade = i;
    }
    
   public double getAltura() {
       return altura;
   }
   
   public void setAltura(double a){
       this.altura = a;
   }
    
}
