package exercicio_metodos_primeiro;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Exercicio_Metodos_primeiro {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero de alunos");
        int numAlunos = teclado.nextInt();

        for (int i = 0; i <= numAlunos; i++) {
            System.out.println("Digite o numero maximo de notas para o aluno" + i + "");
            int numNotas = teclado.nextInt();
            double[] notas = new double[numNotas];

            for (int j = 0; j < numNotas; j++) {
                System.out.println("Digite a nota" + (j + 1) + ": ");
                notas[j] = teclado.nextDouble();
            }
            MediaNotas notasMedias = new MediaNotas(notas);
            double media = media = notasMedias.calcularMedia();
            System.out.println("A media do aluno e" + i + "e: " + media);
        }
        teclado.close();
    }

}
