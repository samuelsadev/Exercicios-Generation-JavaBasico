package ExerciciosDeLaco.ExerciciosRepeticao;

import java.util.Scanner;

public class Ex6DoWhile {
    public static void main(String[] args) {

        int numero, somaMultiplo = 0, contaMultiplo = 0;
        float media = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite um número");
            numero = scanner.nextInt();
            if (numero % 3 == 0) {
                somaMultiplo += numero;
                contaMultiplo++;
            }
        }while (numero != 0);
        if (contaMultiplo == 0) {
            System.out.println("Nenhum múltiplo de 3 encontrado");
        } else {
            media = somaMultiplo / contaMultiplo;
            System.out.println("A média de todos os números múltiplos de 3 é: " + media);
        }
    }
}