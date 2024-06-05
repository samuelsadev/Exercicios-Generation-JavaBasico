package ExerciciosDeLaco.ExercicioLacoCondicionalSwitch;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        String nomeColaborador;
        int cargo;
        double salario, novoSalario;
        Scanner scanner = new Scanner(System.in);


        System.out.println("""
                1 - Gerente       | 10%
                2 - Vendedor      | 7%
                3 - Supervisor    | 9%
                4 - Motorista     | 6%
                5 - Estoquista    | 5%
                6 - Técnico de TI | 8%
                """);

        System.out.println("\nNome do colaborador: ");
        nomeColaborador = scanner.nextLine();
        System.out.println("Digite o número correspondente ao cargo: ");
        cargo = scanner.nextInt();
        System.out.println("\nSalário: ");
        salario = scanner.nextDouble();


        switch (cargo) {
            case 1:
                novoSalario = salario + (salario * 0.10);
                System.out.println("\nNome do colaborador: " + nomeColaborador + "\nCargo: Gerente \nSalário pós reajuste R$" + novoSalario);
                break;
            case 2:
                novoSalario = salario + (salario * 0.07);
                System.out.println("\nNome do colaborador: " + nomeColaborador + "\nCargo: Vendedor \nSalário pós reajuste R$" + novoSalario);
                break;
            case 3:
                novoSalario = salario + (salario * 0.09);
                System.out.println("\nNome do colaborador: " + nomeColaborador + "\nCargo: Supervisor \nSalário pós reajuste R$" + novoSalario);
                break;
            case 4:
                novoSalario = salario + (salario * 0.06);
                System.out.println("\nNome do colaborador: " + nomeColaborador + "\nCargo: Motorista \nSalário pós reajuste R$" + novoSalario);
                break;
            case 5:
                novoSalario = salario + (salario * 0.05);
                System.out.println("\nNome do colaborador: " + nomeColaborador + "\nCargo: Estoquista \nSalário pós reajuste R$" + novoSalario);
                break;
            case 6:
                novoSalario = salario + (salario * 0.08);
                System.out.println("\nNome do colaborador: " + nomeColaborador + "\nCargo: Técnico de TI \nSalário pós reajuste R$" + novoSalario);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
