package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista1.add((int)(Math.random()*100+1));
            lista2.add((int)(Math.random()*100+1));
        }

        lista1.addAll(lista2);
        lista1.stream().distinct().sorted().forEach(num -> System.out.print(num + "  "));

    }
}
