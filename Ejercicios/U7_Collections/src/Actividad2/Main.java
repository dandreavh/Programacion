package Actividad2;

import java.util.ArrayList;
import java.util.Comparator;
// Actividad 2: Repetir el ejercicio anterior, pero ordenar la lista en sentido decreciente.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        Integer n;

        for (int i = 0; i < 20; i++) {
            n = (int) (Math.random()*(100));
            listaNumeros.add(n);
        }
        System.out.println(listaNumeros);

        listaNumeros.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2.compareTo(i1);
            }
        });
        System.out.println(listaNumeros);
    }
}
