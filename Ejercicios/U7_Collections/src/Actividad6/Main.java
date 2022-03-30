package Actividad6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
Introducir por teclado, hasta que se introduzca "fin", una serie de nombres que se insertarán en una colección,
de forma que se conserve el orden de inserción y que no puedan repetirse. Mostrar la estructura por pantalla.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        ArrayList<String> names = new ArrayList<>();

        do {
            System.out.println("Escriba nombres");
            name = sc.nextLine();

            if(!names.contains(name) && !name.equalsIgnoreCase("fin")){ // para que no incluya repetidos ni la palabra fin
                names.add(name); // lo añade a la lista
            }
        } while (!name.equalsIgnoreCase("fin"));

        System.out.println(names);
    }
}
