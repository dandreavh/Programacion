package Tarea1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Actividad2 {
    /*
    Diseñar una aplicación que pida al usuario su nombre y edad.
    Estos datos deben guardarse en el fichero "datos.txt".
    Si este fichero existe, debe borrarse su contenido, y en caso de no existir, debe crearse.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String edad;

        System.out.println("Indique su nombre");
        nombre = sc.nextLine();
        System.out.println("Indique su edad");
        edad = sc.nextLine();

        try {
            FileWriter out = new FileWriter("datos.txt");
            out.write("Nombre: " + nombre + "\n");
            out.write("Edad: " + edad);
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
