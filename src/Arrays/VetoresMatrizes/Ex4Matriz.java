package Arrays.VetoresMatrizes;

import java.util.Scanner;

public class Ex4Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] notasAlunos = new double[10][4];
        double[] media = new double[10];

        System.out.println("Insira as notas: ");
        for (int aluno = 0; aluno < 10; aluno++) {
            for (int nota = 0; nota < 4; nota++) {
                System.out.println("\nAluno " + (aluno + 1) + "/ Bimestre " + (nota + 1) + ":");
                notasAlunos[aluno][nota] = scanner.nextDouble();
            }
        }
        for (int aluno = 0; aluno < 10; aluno++) {
            double soma = 0;
            for (int nota = 0; nota < 4; nota++) {
                soma += notasAlunos[aluno][nota];
            }
            media[aluno] = soma /4;
        }
        System.out.println("\nMédia dos alunos: ");
        for (int aluno = 0; aluno < 10; aluno++) {
            System.out.println("\nAluno " + (aluno + 1) + ": " + media[aluno]);
        }
    }
}
