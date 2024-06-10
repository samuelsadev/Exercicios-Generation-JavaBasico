package Exercicios12ArrayList.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex1CollectionsList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> colorList = new ArrayList<>();
        int op;


        do {
            System.out.println("""
                    1 - Deseja adicionar cores?
                    2 - Deseja listar todas as cores?
                    3 - Deseja ordenar cores?
                    0 - Sair do programa!
                    """);

            op = scanner.nextInt();
            switch (op){
                case 1:
                    scanner.nextLine();
                    System.out.println("Digite 5 cores: ");
                    for (int i = 0; i < 5; i++) {
                        String cor = scanner.nextLine();
                        colorList.add(cor);
                    }
                    break;
                case 2:
                    System.out.println("Lista de cores: " + colorList);
                    break;
                case 3:
                    Collections.sort(colorList);
                    System.out.println("Lista ordenada: " + colorList);
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar nosso sistema! Volte sempre!!!");
                    break;
            }
        } while (op != 0);
    }
}
