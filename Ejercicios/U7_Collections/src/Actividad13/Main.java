package Actividad13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Implementar una función a la que se le pasen dos listas ordenadas y nos devuelva una única lista,
fusión de las dos anteriores. Desarrollar el algoritmo de forma no destructiva, es decir,
que las listas utilizadas como parámetros de entrada se mantengan intactas.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list1.add((int) (Math.random()*(3)+1));
            list2.add((int) (Math.random()*(3)+1));
        }

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(fusionar(list1, list2));
    }

    public static List fusionar(List l1, List l2){
        /*
        ArrayList<Integer> fusion = new ArrayList<>();
        fusion.addAll(l1);
        fusion.addAll(l2);

        fusion.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i1.compareTo(i2);
            }
        });

        return fusion;

         */

        List resultado = new ArrayList<>(l1);
        resultado.addAll(l2);

        Collections.sort(resultado);

        return resultado;
    }
}
