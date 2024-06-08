package Arrays.VetoresMatrizes;

import java.util.Scanner;

public class Ex2Vetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantas posições terá o vetor: ");
        int posicoes = scanner.nextInt();
        int [] vetor = new int[posicoes];
        int soma = 0;
        double media;

        for (int i = 0; i < posicoes; i++) {
            System.out.println("\nNúmero " + (i + 1) + ":");
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
        }
        System.out.println("Elementos nos índices ímpares: ");
        for (int i = 0; i < posicoes ; i++) {
            if (i %2 != 0) {
                System.out.println("Indice " + i + ":" + vetor[i]);
            }
        }
        System.out.println("Elementos pares: ");
        for (int i = 0; i < posicoes; i++) {
            if (vetor[i] %2 == 0) {
                System.out.println(vetor[i]);
            }
        }
        System.out.println("Soma: " + soma);

        media = (double) soma / posicoes;
        System.out.println("Média: " + media);
    }
}