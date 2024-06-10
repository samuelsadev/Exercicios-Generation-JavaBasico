package Exercicios12ArrayList.Collections;

import java.util.*;

public class Ex3CollectionSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> lista = new HashSet<>();
        int numero;

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira um número: ");
            numero = scanner.nextInt();
            lista.add(numero);
        }
        Iterator<Integer> iterator = lista.iterator();

        while(iterator.hasNext()){
            System.out.println("Listar dados do Set" + iterator.next());
        }
    }
}
