package com.mycompany.caneta;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Caneta {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a marca da caneta");
        String marcaC1 = teclado.nextLine();
        System.out.println("Digite a cor da caneta");
        String corC1 = teclado.nextLine();
        System.out.println("Digite a espessura da caneta");
        String pontaC1 = teclado.nextLine();
        System.out.println("Digite a carga da caneta");
        int cargaC1 = teclado.nextInt();
        
        CanetaClass c1 = new CanetaClass();

c1.marca = marcaC1;
c1.cor = corC1;
c1.ponta = pontaC1;
c1.carga = cargaC1;
boolean respostaTampada = c1.perguntarTampada();
c1.esta_tampada = respostaTampada;

//c1.tampar();
c1.destampar();
c1.escrever();

c1.estado_atual();
    }
}
