package ExerciciosDeLaco.ExercicioLacoCondicionalSwitch;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        float valor1, valor2, resultado;
        boolean encerrar = false;
        int operacao;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("""
                \n
                1 - somar +
                2 - subtrair -
                3 - multiplicar *
                4 - dividir /
                0 - sair X
                """);

            operacao = scanner.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Digite o primeiro valor");
                    valor1 = scanner.nextFloat();
                    System.out.println("Digite o segundo valor");
                    valor2 = scanner.nextFloat();
                    resultado = valor1 + valor2;

                    if (resultado >=1 && resultado <=4) {
                        System.out.printf("Resultado da soma é %2f\n", resultado);
                    } else {
                        System.out.println("Operação Inválida!");
                    }
                    break;
                case 2:
                    System.out.println("Digite o primeiro valor");
                    valor1 = scanner.nextFloat();
                    System.out.println("Digite o segundo valor");
                    valor2 = scanner.nextFloat();
                    resultado = valor1 - valor2;

                    if (resultado >=1 && resultado <=4) {
                        System.out.printf("Resultado da soma é %2f\n", resultado);
                    } else {
                        System.out.println("Operação Inválida!");
                    }
                    break;
                case 3:
                    System.out.println("Digite o primeiro valor");
                    valor1 = scanner.nextFloat();
                    System.out.println("Digite o segundo valor");
                    valor2 = scanner.nextFloat();
                    resultado = valor1 * valor2;

                    if (resultado >=1 && resultado <=4) {
                        System.out.printf("Resultado da soma é %2f\n", resultado);
                    } else {
                        System.out.println("Operação Inválida!");
                    }
                    break;
                case 4:
                    System.out.println("Digite o primeiro valor");
                    valor1 = scanner.nextFloat();
                    System.out.println("Digite o segundo valor");
                    valor2 = scanner.nextFloat();
                    resultado = valor1 / valor2;

                    if (resultado >=1 && resultado <=4) {
                        System.out.printf("Resultado da soma é %2f\n", resultado);
                    } else {
                        System.out.println("Operação Inválida!");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando programa");
                    encerrar = true;
                    break;
                default:
                    break;
            }
        } while (!encerrar);
    }
}
