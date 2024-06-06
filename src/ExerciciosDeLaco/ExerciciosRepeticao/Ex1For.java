package ExerciciosDeLaco.ExerciciosRepeticao;

import java.util.Scanner;

public class Ex1For {
    public static void main(String[] args) {
        int intervalo1, intervalo2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro intervalo: ");
        intervalo1 = scanner.nextInt();
        System.out.println("Digite o segundo intervalo: ");
        intervalo2 = scanner.nextInt();

        if (intervalo1 < intervalo2) {
            System.out.println("O intervalo começa em " + intervalo1 + " e termina em " + intervalo2);
            for (int i = intervalo1; i < intervalo2; i++) {
                if (i %3 == 0 && i %5 == 0) {
                    System.out.println(i + " é multiplo de 3 e 5");
                }
            }
        }else {
            System.out.println("Intervalo inválido");
        }
    }
}
