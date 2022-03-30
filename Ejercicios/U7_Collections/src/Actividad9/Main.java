package Actividad9;

import java.util.LinkedHashSet;
import java.util.Set;
/*
 Implementar el método unión de dos conjuntos, que devuelva un nuevo conjunto con todos los elementos que pertenezcan,
 al menos, a uno de los dos conjuntos. Su prototipo es:
 Set union (Set conjunto1, Set conjunto2)
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

        System.out.println(union(set1, set2));
    }
    public static Set union(Set set1, Set set2){
        Set<String> joinedSets = new LinkedHashSet<>(set1); // LO CREO CON EL CONTENIDO DEL PRIMERO
        joinedSets.addAll(set2); // AHORA LE AÑADO TOODO EL CONTENIDO DEL SEGUNDO, SIN REPETIDOS

        return joinedSets;
    }
}
