package ExerciciosDeLaco.ExerciciosLacoCondicional;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeDoador;
        int idade, comparador;
//        boolean apto;
        boolean primeiraDoacao = false;

        System.out.println("Digite o nome do doador: ");
        nomeDoador = scanner.nextLine();
        System.out.println("Digite a idade do doador: ");
        idade = scanner.nextInt();
        System.out.println("Digite [1] se é a primeira doaçao, ou [2] se já doou outra vez: ");
    //    primeiraDoacao = scanner.nextBoolean();
        comparador = scanner.nextInt();

        switch (comparador) {
            case 1:
                primeiraDoacao = true;
                break;
            case 2:
                primeiraDoacao = false;
                break;
            default:
                System.out.println("\nOpção inválida!");
        }
        if (idade >= 60 && idade <= 69 && primeiraDoacao == true) {
            System.out.println(nomeDoador + " não está apto para doar");
        } else if (idade >= 60 && idade <= 69 && primeiraDoacao == false) {
            System.out.println(nomeDoador + " está apto para doar");
        } else if (idade >= 18 && idade < 60) {
            System.out.println(nomeDoador + " está apto para doar");
        } else {
            System.out.println(nomeDoador + " não está apto para doar");
        }


        // verificador se está apto ou não
//        apto = false;
//
//        if (idade >= 18 && idade <= 69) {
//            if (idade < 60) {
//                apto = true;
//                System.out.println("\nO doador " + nomeDoador + " está apto para doação");
//            } else {
//                apto = !primeiraDoacao;
//                System.out.println("\nO doador " + nomeDoador + " não apto para doação");
//            }
//        }
    }
}