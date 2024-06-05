package ExerciciosDeLaco.ExercicioLacoCondicionalSwitch;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int codigoProduto, quantidade;
        double preco, precoTotal;
        Scanner scanner = new Scanner(System.in);


           System.out.println("""
                   1 - Cachorro Quente | R$ 10.00
                   2 - X-Salada        | R$ 15.00
                   3 - X-Bacon         | R$ 18.00
                   4 - Bauru           | R$ 12.00
                   5 - Refrigerante    | R$ 8.00
                   6 - Suco de laranja | R$ 13.00
                   """);

           System.out.println("Selecione o código do produto: ");
           codigoProduto = scanner.nextInt();
           System.out.println("Quantidade: ");
           quantidade = scanner.nextInt();


           switch (codigoProduto) {
               case 1:
                   preco = 10.00;
                   precoTotal = preco * quantidade;
                   System.out.println("Você comprou " + quantidade + " Cachorro Quente e custou R$" + precoTotal);
                   break;
               case 2:
                   preco = 15.00;
                   precoTotal = preco * quantidade;
                   System.out.println("Você comprou " + quantidade + " X-Salada e custou R$" + precoTotal);
                   break;
               case 3:
                   preco = 18.00;
                   precoTotal = preco * quantidade;
                   System.out.println("Você comprou " + quantidade + " X-Bacon  e custou R$" + precoTotal);
                   break;
               case 4:
                   preco = 12.00;
                   precoTotal = preco * quantidade;
                   System.out.println("Você comprou " + quantidade + " Bauru e custou R$" + precoTotal);
                   break;
               case 5:
                   preco = 8.00;
                   precoTotal = preco * quantidade;
                   System.out.println("Você comprou " + quantidade + " Refrigerante e custou R$" + precoTotal);
                   break;
               case 6:
                   preco = 13.00;
                   precoTotal = preco * quantidade;
                   System.out.println("Você comprou " + quantidade + " Suco de laranja e custou R$" + precoTotal);
                   break;
               default:
                   System.out.println("Opção inválida");
           }
    }
}