package JavaBasico;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        // Declaração de variaveis
        float[] notas = new float[4];
        float media = 0;
        float mediaFinal = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++ ) {
            System.out.printf("Digite a nota %d: ", i + 1);
            notas[i] = entrada.nextFloat();
        }

        for (int i = 0; i < notas.length; i++) {
            mediaFinal += notas[i];
        }

        mediaFinal /= notas.length;
        System.out.println("A média final é: " + mediaFinal);
    }
}
