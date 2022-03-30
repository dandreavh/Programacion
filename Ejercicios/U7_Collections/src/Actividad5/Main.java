package Actividad5;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Crear una colección de 20 números enteros aleatorios distintos menores que 100,
guardarlos por orden decreciente a medida que se vayan generando, y mostrar la colección por pantalla.
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> myNumbersSet = new TreeSet<>();
        Integer number;

        for (int i = 0; i < 20; i++) {
            number = (int) (Math.random()*(100));
            myNumbersSet.add(number);
        }
        System.out.println(myNumbersSet);

        // mirar esto bien, no hace el orden correcto
        myNumbersSet.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2.compareTo(i1);
            }
        });
        System.out.println(myNumbersSet);
    }
}
