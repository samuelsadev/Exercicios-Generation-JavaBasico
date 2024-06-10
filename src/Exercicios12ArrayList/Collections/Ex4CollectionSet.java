package Exercicios12ArrayList.Collections;

import java.util.*;

public class Ex4CollectionSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        Set<Integer> lista = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira um número: ");
            numero = scanner.nextInt();
            lista.add(numero);
        }

        System.out.println("Digite um número para busca: ");
        numero = scanner.nextInt();

        if (lista.contains(numero)) {
            System.out.println("O número " + numero + " foi encontrado!");
        } else {
            System.out.println("O número " + numero + " não foi encontrado!");
        }
    }
}
