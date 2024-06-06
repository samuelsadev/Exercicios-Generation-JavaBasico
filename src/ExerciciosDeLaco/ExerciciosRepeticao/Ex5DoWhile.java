package ExerciciosDeLaco.ExerciciosRepeticao;

import java.util.Scanner;

public class Ex5DoWhile {
    public static void main(String[] args) {
        int numero, somaNumero = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");

        do {
            numero = scanner.nextInt();
            if (numero > 0) {
                somaNumero += numero;
            }
        }while (numero != 0);
        System.out.println("A soma dos números positivos é: " + somaNumero);
    }
}
