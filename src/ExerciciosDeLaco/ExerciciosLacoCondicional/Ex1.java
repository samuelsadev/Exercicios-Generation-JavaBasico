package ExerciciosDeLaco.ExerciciosLacoCondicional;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int valor1, valor2, valor3, resultado;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite o primeiro valor: ");
        valor1 = scanner.nextInt();
        System.out.println("\nDigite o segundo valor: ");
        valor2 = scanner.nextInt();
        System.out.println("\nDigite o terceiro valor: ");
        valor3 = scanner.nextInt();

        resultado = valor1 + valor2;

        if (resultado > valor3) {
            System.out.println("\nA soma de " + valor1 + " + " + valor2 + " = " + resultado + " é maior que " + valor3);
        } else if (resultado < valor3) {
            System.out.println("\nA soma de " + valor1 + " + " + valor2 + " = " + resultado + " é menor que " + valor3);
        } else {
            System.out.println("\nA soma de " + valor1 + " + " + valor2 + " = " + resultado + " é igual a " + valor3);
        }
    }
}
