package Arrays.VetoresMatrizes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex1Vetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean numeroEncontrato = false;
        int[] numerosArmazenados = new int[10];
        int noArray = 0, numeroConsultaP;
        Set<Integer> numeroInserido = new HashSet<>();


        System.out.println("\nDigite os números que deseja armazenar: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("\nNúmero " + (i + 1) + ":");
            int numero = scanner.nextInt();

            if (numeroInserido.contains(numero)) {
                System.out.println("\nNúmero repetido, por favor digite outro número!");
                i--;
            } else {
                numerosArmazenados[noArray] = numero;
                numeroInserido.add(numero);
                noArray++;
            }
        }
        System.out.println("\nNúmeros armazenados: ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d, ",numerosArmazenados[i]);
        }

            System.out.println("\nDigite o número do array que deseja consultar a posição: ");
            numeroConsultaP = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            if (numeroConsultaP == numerosArmazenados[i]){
                System.out.println("\nO número " + numeroConsultaP + " está na posição: "+ i);
                return;
            }
        }
        if (!numeroEncontrato) {
            System.out.println("\nO número " + numeroConsultaP + " não foi encontrado!");
        }
    }
}