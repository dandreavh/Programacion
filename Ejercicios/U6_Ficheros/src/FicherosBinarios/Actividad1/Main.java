package FicherosBinarios.Actividad1;

import java.io.*;
import java.util.Scanner;

public class Main {
    // Pedir un double por consola y guardarlo en un archivo binario.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ObjectOutputStream out = null;

        try {
            FileOutputStream datos = new FileOutputStream("numbers.dat");
            out = new ObjectOutputStream(datos);
            double num;

            System.out.println("Indique un número doble");
            num = sc.nextDouble();

            out.writeDouble(num);

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
