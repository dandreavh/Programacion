package Actividad1;

import java.util.ArrayList;
import java.util.Comparator;
/*
Actividad 1: Crear una colección de 20 números enteros aleatorios menores que 100, y
guardarlos en el orden en que se vayan generando; mostrar por pantalla dicha lista una vez creada.
Ordenarla en sentido creciente y volverla a mostrar por pantalla.
*/
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
                return i1.compareTo(i2);
            }
        });
        System.out.println(listaNumeros);
    }
}
