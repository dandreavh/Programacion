package Actividad10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
Hacer lo mismo que en el ejercicio anterior con la intersección , formada por los elementos comunes a los dos conjuntos. Su prototipo es:

Set interseccion (Set conjunto1, Set conjunto2)

 */
public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new LinkedHashSet<>();
        Set<String> set2 = new LinkedHashSet<>();

        set1.add("Hola");
        set1.add("Adiós");
        set1.add("Guao");
        set1.add("Guao");

        set2.add("Hola");
        set2.add("Adiós");
        set2.add("Tiririti");
        set2.add("Yuuuju");

        System.out.println(interseccion(set1, set2));
    }

    public static Set interseccion (Set set1, Set set2){
        set1.retainAll(set2); // modifica el original set1, y le quita el resto no repetido
        return set1;
    }

    public static Set distintosYrepetidos(Set set1, Set set2){
        Set<String> result = new HashSet<>();
        Iterator it = set1.iterator();
        while(it.hasNext()){
            String palabra = (String) it.next();
            if(set1.contains(palabra)){
                result.add(palabra);
            }
        }
        return result;
    }

    public static Set diferencia(Set set1, Set set2){ // resta los que están en uno
        Set<String> result = new HashSet<>();
        Iterator it = set1.iterator();
        while(it.hasNext()){
            String palabra = (String) it.next();
            if(!set1.contains(palabra)){
                result.add(palabra);
            }
        }
        return result;
    }
}
