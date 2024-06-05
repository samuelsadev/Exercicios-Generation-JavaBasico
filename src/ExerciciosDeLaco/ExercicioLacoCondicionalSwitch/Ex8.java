package ExerciciosDeLaco.ExercicioLacoCondicionalSwitch;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        String nome;
        String cpf;
        double saldo = 0;
        int sair = 1;
        String exibirMenu;
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** CONTA BANCÁRIA ***");
        System.out.println("\nInsira o nome do titular:");
        nome = scanner.nextLine();

        System.out.println("\nInsira o CPF do titular:");
        cpf = scanner.nextLine();

        exibirMenu = """
                \n
                0- Sair
                1- Consultar Saldo
                2- Despositar
                3- Sacar
                4- Dados
                """;

        do {
            System.out.println(exibirMenu);
            int opcoes = scanner.nextInt();

            if (opcoes == 1) {
                System.out.println(saldo);
            } else if (opcoes == 2) {
                System.out.println("Insira o valor do depósito: ");
                double valorDeposito;
                valorDeposito = scanner.nextDouble();
                saldo = saldo + valorDeposito;
            } else if (opcoes == 3) {
                System.out.println("Insira o valor que deseja sacar: ");
                double valorSaque;
                valorSaque = scanner.nextDouble();
                if (valorSaque < saldo) {
                    System.out.println("Você sacou " + valorSaque + " reais");
                    saldo = saldo - valorSaque;
                } else {
                    System.out.println("Você não tem saldo suficiente!");
                }
            } else if (opcoes == 4) {
                System.out.println("Nome: " + nome + "\nCPF: " + cpf);
            } else if (opcoes == 0) {
                System.out.println("*** ECERRANDO ***");
                sair = 0;
            } else {
                System.out.println("Opcão inválida, digite alguma das opções indicadas");
            }
        } while (sair != 0);
    }
}