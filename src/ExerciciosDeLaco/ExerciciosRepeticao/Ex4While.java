package ExerciciosDeLaco.ExerciciosRepeticao;

import java.util.Scanner;

public class Ex4While {
    public static void main(String[] args) {

        int idade, generoID, tipoDev, contador1 = 0, contador2 = 0,
                contador3 = 0, contador4 = 0, contPessoa = 0, contIdade = 0;
        String cnontinuar;
        double idadeMedia;

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("\nDigite a idade: ");
            idade = sc.nextInt();

            contIdade += idade;

            System.out.println("""
                \nIdentidade de Gênero:
                1 – Mulher Cis
                2 – Homem Cis
                3 – Não Binário
                4 – Mulher Trans
                5 – Homem Trans
                6 – Outros
                """);

            generoID = sc.nextInt();

            System.out.println("""
                \nPessoa Desenvolvedora
                1 – Backend
                2 – Frontend
                3 – Mobile
                4 – FullStack
                """);
            tipoDev = sc.nextInt();
            System.out.println("\n\nDeseja continuar? (S/N) ");
            cnontinuar = sc.next();


            if(tipoDev == 1){
                contador1++;
            }else if(tipoDev == 2 && generoID == 1 || generoID == 4){
                contador2++;
            }else if(tipoDev == 3 && generoID == 2 || generoID ==5 && idade>40){
                contador3++;
            }else if(tipoDev == 4 && generoID == 3 && idade>30){
                contador4++;
            }


            contPessoa++;
            if(cnontinuar.equalsIgnoreCase("N")) {
                break;
            }
        }

        idadeMedia = (contIdade/contPessoa);

        System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + contador1
                + "\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: " + contador2
                + "\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + contador3
                + "\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + contador4
                + "\nNúmero total de pessoas que responderam à pesquisa: " + contPessoa
                + "\nMédia de idade das pessoas que responderam à pesquisa: " + (idadeMedia));
    }
}
