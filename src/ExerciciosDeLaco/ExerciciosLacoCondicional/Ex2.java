package ExerciciosDeLaco.ExerciciosLacoCondicional;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ser verificado: ");
        numero = scanner.nextInt();

        if (numero % 2 == 0 && numero >=0) {
            System.out.println("O número " + numero + " é par e positivo");
        } else if (numero % 2 != 0 && numero < 0) {
            System.out.println("O número " + numero + " é ímpar e negativo");
        } else if (numero % 2 == 0 && numero < 0) {
            System.out.println("O número " + numero + " é par e negativo");
        } else {
            System.out.println("O número " + numero + " é ímpar e positivo");
        }
    }
}
