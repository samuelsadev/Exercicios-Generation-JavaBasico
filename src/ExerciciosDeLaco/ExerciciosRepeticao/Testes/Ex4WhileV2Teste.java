package ExerciciosDeLaco.ExerciciosRepeticao.Testes;

import java.util.Scanner;

// PROGRAMA EM DESENVOLVIMENTO

public class Ex4WhileV2Teste {
    public static void main(String[] args) {
        int idade, opcao, genero, dev, cont = 0, contMC = 0, contHC = 0, contNB = 0, contMT = 0, contHT = 0, contO = 0;
        int backend = 0, frontend = 0, mobile = 0, fullstack = 0;
        String menuIdGenero, menuDev, continuar;


        Scanner scanner = new Scanner(System.in);

        menuIdGenero = """
                \nIdentidade de Gênero:
                1 – Mulher Cis
                2 – Homem Cis
                3 – Não Binário
                4 – Mulher Trans
                5 – Homem Trans
                6 – Outros
                """;
        menuDev = """
                \nPessoa Desenvolvedora
                1 – Backend
                2 – Frontend
                3 – Mobile
                4 – FullStack
                """;

        System.out.println("Digite a idade do colabrador: ");
        idade = scanner.nextInt();
        System.out.println(menuIdGenero);
        System.out.println("\nDigite a identidade do gênero: ");
        genero = scanner.nextInt();
        System.out.println(menuDev);
        System.out.println("Digite que tipo de desenvolvedor o colaborador é: ");
        dev = scanner.nextInt();


        System.out.println("Digite [s] para continuar ou [n] para sair");
        continuar = scanner.nextLine();

        while (!continuar.equalsIgnoreCase("n")) {
            System.out.println("Digite a idade do colabrador: ");
            idade = scanner.nextInt();

            System.out.println(menuIdGenero);
            System.out.println("\nDigite a identidade de gênero: ");
            genero = scanner.nextInt();

            System.out.println(menuDev);
            System.out.println("\nDigite que tipo de desenvolvedor o colaborador é: ");
            dev = scanner.nextInt();


            switch (genero) {
                case 1:
                    contMC++;
                    System.out.println("\nDigite que tipo de desenvolvedor o colaborador é: ");
                    dev = scanner.nextInt();
                    if (dev == 1) {
                        backend++;
                    } else if (dev ==2) {
                        frontend++;
                    } else if (dev == 3) {
                        mobile++;
                    } else if (dev == 4) {
                        fullstack++;
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    //genero
                    break;
                case 2:
                    contHC++;
                    System.out.println("\nDigite que tipo de desenvolvedor o colaborador é: ");
                    dev = scanner.nextInt();
                    if (dev == 1) {
                        backend++;
                    } else if (dev ==2) {
                        frontend++;
                    } else if (dev == 3) {
                        mobile++;
                    } else if (dev == 4) {
                        fullstack++;
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    //genero
                    break;
                case 3:
                    contNB++;
                    System.out.println("\nDigite que tipo de desenvolvedor o colaborador é: ");
                    dev = scanner.nextInt();
                    if (dev == 1) {
                        backend++;
                    } else if (dev ==2) {
                        frontend++;
                    } else if (dev == 3) {
                        mobile++;
                    } else if (dev == 4) {
                        fullstack++;
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    //genero
                    break;
                case 4:
                    contMT++;
                    System.out.println("\nDigite que tipo de desenvolvedor o colaborador é: ");
                    dev = scanner.nextInt();
                    if (dev == 1) {
                        backend++;
                    } else if (dev ==2) {
                        frontend++;
                    } else if (dev == 3) {
                        mobile++;
                    } else if (dev == 4) {
                        fullstack++;
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    //genero
                    break;
                case 5:
                    contHT++;
                    System.out.println("\nDigite que tipo de desenvolvedor o colaborador é: ");
                    dev = scanner.nextInt();
                    if (dev == 1) {
                        backend++;
                    } else if (dev ==2) {
                        frontend++;
                    } else if (dev == 3) {
                        mobile++;
                    } else if (dev == 4) {
                        fullstack++;
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    //genero
                    break;
                case 6:
                    contO++;
                    System.out.println("\nDigite que tipo de desenvolvedor o colaborador é: ");
                    dev = scanner.nextInt();
                    if (dev == 1) {
                        backend++;
                    } else if (dev ==2) {
                        frontend++;
                    } else if (dev == 3) {
                        mobile++;
                    } else if (dev == 4) {
                        fullstack++;
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    //genero
                    break;
                default:
                    System.out.println("Programa encerrado!");
            }
            System.out.println("Digite que tipo de desenvolvedor o colaborador é: ");
            dev = scanner.nextInt();
            cont++;

            System.out.println("Digite [s] para continuar ou [n] para sair");
            continuar = scanner.nextLine();

        }
    }
}
