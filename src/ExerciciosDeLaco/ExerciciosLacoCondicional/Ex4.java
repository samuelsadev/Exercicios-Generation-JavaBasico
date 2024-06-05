package ExerciciosDeLaco.ExerciciosLacoCondicional;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        String entrada1, entrada2, entrada3;

        System.out.println("=== Escola entre as categorias ===\n Categorias [Vertebrado] / [Invertebrado]");
        entrada1 = scaner.nextLine();

        if (entrada1.equalsIgnoreCase("Vertebrado")) {
            System.out.println("=== Escola a proxima categoria ===\n[Ave] / [Mamifero]");
            entrada2 = scaner.nextLine();
            if (entrada2.equalsIgnoreCase("Ave")) {
                System.out.println("=== Escola a proxima categoria ===\n[Carnivoro] / [Onivoro]");
                entrada3 = scaner.nextLine();
                if (entrada3.equalsIgnoreCase("Carnivoro")) {
                    System.out.println("Vertebrado\nAve\nÁguia");
                } else if (entrada3.equalsIgnoreCase("Onivoro")) {
                    System.out.println("Vertebrado\nAve\nPomba");
                } else {
                    System.out.println("Entrada invalida");
                }
            } else if (entrada2.equalsIgnoreCase("Mamifero")) {
                System.out.println("=== Escola a proxima categoria ===\n[Onivoro] / [Herbivoro]");
                entrada3 = scaner.nextLine();
                if (entrada3.equalsIgnoreCase("Onivoro")) {
                    System.out.println("Vertebrado,\nMamifero\nHomem");
                } else if (entrada3.equalsIgnoreCase("Herbivoro")) {
                    System.out.println("Vertebrado,\nMamifero\nVaca");
                }
            }
        } else if (entrada1.equalsIgnoreCase("Invertebrado")) {
            System.out.println("=== Escola a proxima categoria ===\n[Inseto] / [Anelidio]");
            entrada2 = scaner.nextLine();
            if (entrada2.equalsIgnoreCase("Inseto")) {
                System.out.println("=== Escola a proxima categoria ===\n[Hematofago] / [Herbivoro]");
                entrada3 = scaner.nextLine();
                if (entrada3.equalsIgnoreCase("Hematofago")) {
                    System.out.println("Invertabrado\nInseto\nHematofago\nPulga");
                } else if (entrada3.equalsIgnoreCase("Herbivoro")) {
                    System.out.println("Invertabrado\nInseto\nHematofago\nLargata");
                } else {
                    System.out.println("Entrada invalida");
                }
            } else if (entrada2.equalsIgnoreCase("Anelideo")) {
                System.out.println("=== Escola a proxima categoria ===\n[Hematofago] / [Onivoro]");
                entrada3 = scaner.nextLine();
                if (entrada3.equalsIgnoreCase("Hematofago")) {
                    System.out.println("Anelideo\nHematofago\nSangue suga");
                } else if (entrada3.equalsIgnoreCase("Onivoro")) {
                    System.out.println("Anelideo\nOnivoro\nMinhoca");
                } else {
                    System.out.println("Entrada invalida");
                }
            }
        } else {
            System.out.println("Entrada Invalida");
        }
        scaner.close();
    }
}