package Actividad12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
Escribir el método incluido(), que devuelve true si todos los elementos del primer conjunto pertenecen al segundo y
false si hay algún elemento del primero que no pertenezca al segundo.
Su prototipo es:
boolean incluido(Set conjunto1, Set conjunto2)
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            set1.add((int) (Math.random()*(3)+1));
            set2.add((int) (Math.random()*(3)+1));
        }

        System.out.println(set1 + " y " + set2);
        System.out.println("¿Se contienen los elementos del primero en el segundo?: " + incluido(set1, set2));
    }

    public static boolean incluido(Set conjunto1, Set conjunto2){
        /*
        OPCION 1:
        Iterator it = conjunto1.iterator();

        while (it.hasNext()){
            if (!conjunto2.contains(it.next())){
                return false;
            }
        }
        return true;
         */

        // OPCIÓN 2

        return conjunto2.containsAll(conjunto1);
    }
}
