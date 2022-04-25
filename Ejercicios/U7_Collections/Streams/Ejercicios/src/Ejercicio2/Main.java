package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        int number = 0;

        for (int i = 0; i < 10; i++) {
            number = (int) (Math.random()*100+1);
            lista.add(number);
        }

        System.out.println(lista);

        lista.stream()
                .filter(num -> num%7==0)
                .distinct()
                .forEach(num -> System.out.println("El número " + num + " es múltiplo de 7"));
    }
}
