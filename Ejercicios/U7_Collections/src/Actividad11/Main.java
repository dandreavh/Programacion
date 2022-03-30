package Actividad11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
Diseñar un método que devuelva la diferencia de dos conjuntos (elementos que pertenecen al primero, pero no al segundo)
. Con el prototipo: Set diferencia (Set conjunto1, Set conjunto2)
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Integer number;

        for (int i = 0; i < 5; i++) {
            number = (int) (Math.random()*(10));
            set1.add(number);
            set2.add(number+1);
        }

        System.out.println(set1 + " - " + set2);

        System.out.println("Diferencia: " + diferencia(set1, set2));
    }

    public static Set diferencia (Set set1, Set set2){
        Set<Integer> result = new HashSet<>(set1);
        Iterator it = set1.iterator();
        while(it.hasNext()){
            Integer number = (Integer) it.next();
            if(!set2.contains(number)){
                result.add(number);
            }
        }
        return result;
    }
}
