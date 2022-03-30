package Actividad8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Implementar una función a la que se le pase una lista de nombres y devuelva una copia sin elementos repetidos (sin modificar la original), con el prototipo:
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("aaaa");
        lista.add("aaaa");
        lista.add("eeee");
        lista.add("eeee");
        lista.add("iiii");

        System.out.println(lista);

        System.out.println(eliminaRepetidos(lista));
    }
    public static List eliminaRepetidos (List c){
        ArrayList<String> copia = new ArrayList<>();

        Iterator it = c.iterator();

        while (it.hasNext()){
            String element = (String) it.next();

            if (!copia.contains(element)){
               copia.add(element);
            }
        }

        return copia;
    }
}
