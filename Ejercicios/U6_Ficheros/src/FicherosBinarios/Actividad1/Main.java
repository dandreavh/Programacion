package FicherosBinarios.Actividad1;

import java.io.*;
import java.util.Scanner;

public class Main {
    // Pedir un double por consola y guardarlo en un archivo binario.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;
        ObjectOutputStream out = null;
        FileOutputStream archivo;

        try {
            archivo = new FileOutputStream("numbers.dat");
            out = new ObjectOutputStream(archivo);

            System.out.println("Indique un número doble");
            num = sc.nextDouble();

            out.writeObject(num);

        } catch (Exception e) {
            e.printStackTrace();
        }  finally {
            try {
                if (out != null)
                    out.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }
}
