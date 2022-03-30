package Actividad3;

import java.util.ArrayList;
import java.util.Comparator;

/*
Crear una colección de 20 números enteros aleatorios menores que 10, guardarlos por orden decreciente
a medida que se vayan generando y mostrar la colección por pantalla.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        Integer n;

        for (int i = 0; i < 20; i++) {
            n = (int) (Math.random()*(10));
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
