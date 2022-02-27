package FicherosBinarios;

import java.io.*;

public class Prueba {

    public static void main(String[] args) {

        Persona p = new Persona("Lola", "Flores");

        try {
            FileOutputStream archivo = new FileOutputStream("personas.dat");
            ObjectOutputStream out = new ObjectOutputStream(archivo);

            out.writeObject(p);

        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            FileInputStream archivo = new FileInputStream("personas.dat");
           // ObjectInputStream in = new FileInputStream(archivo);

            /*
            Persona person = (Persona) in.readObject();
            System.out.println(person);
             */

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
