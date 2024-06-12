package Exercicios12ArrayList.Collections;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex2CollectionsList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean naoEncontrado = false;
        int numero;

        ArrayList<Integer> listaNumero = new ArrayList<>();

        for (int i = 1; i <10 ; i++) {
            int numeroAleatorio = random.nextInt(100) + 1;
            System.out.println(numeroAleatorio);
            listaNumero.add(numeroAleatorio);
        }

        System.out.println("Digite um número para busca: ");
        numero = scanner.nextInt();

        for (int i = 0; i < listaNumero.size(); i++) {
            int naLista = listaNumero.get(i);
            if (numero == naLista) {
                System.out.println("O número " + numero + " está localizado na posição " + i);
                break;
            }
        }
        if (!naoEncontrado) {
            System.out.println("Número " + numero + " não encontrado!");

        }
    }
}
