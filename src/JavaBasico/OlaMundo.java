package JavaBasico;

import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) {

        String nome = "Samuel";
        int idade = 22;
        float altura = 1.74f,nota1,nota2,nota3,media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nSeu nome é: "+nome);
        System.out.println("\nVocê viveu: "+idade+" anos de vida");
        System.out.println("\nSua altura é: "+altura);

        System.out.println("\nEntre com a primeira nota: ");
        nota1 = scanner.nextFloat();
        System.out.println("\nEntre com a segunda nota: ");
        nota2 = scanner.nextFloat();
        System.out.println("\nEntre com a terceira nota: ");
        nota3 = scanner.nextFloat();

        media = (nota1+nota2+nota3) / 3;

        System.out.println("\nA sua média foi de: "+media);
        System.out.printf("\nSua média foi de: %.2f",media);

        nota1 = (float) Math.pow(nota2,3);
        nota2 = (float) Math.sqrt(nota3);

        int a=2, b=8;
        a = b % a; // resto da divisão

    }

}
