package Actividad7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/*
Introducir por teclado, hasta que se introduzca "fin", una serie de nombres que se insertarán por orden alfabético
en una colección que no permita repeticiones. Mostrar luego la lista de nombres por pantalla.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        ArrayList<String> names = new ArrayList<>();

        do {
            System.out.println("Escriba nombres");
            name = sc.nextLine();

            if(!names.contains(name) && !name.equalsIgnoreCase("fin")){ // solo una vez y no palabra fin
                names.add(name);
            }

        } while (!name.equalsIgnoreCase("fin"));
        System.out.println(names);

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2); // ordenación alfabética de a-z
            }
        });

        System.out.println(names);
    }
}
