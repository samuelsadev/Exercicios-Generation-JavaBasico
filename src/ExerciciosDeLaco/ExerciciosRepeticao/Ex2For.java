package ExerciciosDeLaco.ExerciciosRepeticao;

import java.util.Scanner;

public class Ex2For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, contPar = 0, contImpar = 0;

        for (int i = 0; i <= 9; i++) {
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            if (numero % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }
        System.out.println("Total de números pares: " + contPar);
        System.out.println("Total de números ímpares: " + contImpar);
    }
}