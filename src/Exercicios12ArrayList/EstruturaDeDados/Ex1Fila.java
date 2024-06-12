package Exercicios12ArrayList.EstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex1Fila {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();
        int op;


        do {
            System.out.println("""
                    \n1 - Adicionar Cliente na Fila
                    2 - Listar todos os Clientes
                    3 - Retirar Cliente da Fila
                    0 - Sair
                                        
                    Escolha a opção desejada:
                    """);
            op = scanner.nextInt();
            String nomeCliente;

            switch (op) {
                case 1:
                    scanner.nextLine();
                    System.out.println("\nAdicione um nome na fila: ");
                    nomeCliente = scanner.nextLine();
                    fila.add(nomeCliente);
                    System.out.println("\nCliente" + nomeCliente + "adicionado a fila!");
                    break;
                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Nenhum cliente na fila");
                    } else {
                        System.out.println("Fila: ");
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                    }
                    break;
                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        String retiraCliente = fila.poll();
                        System.out.println("\nO cliente" + retiraCliente + " foi chamado!");
                    }
                    break;
                case 0:
                    System.out.println("Programa Finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (op != 0);
    }
}
