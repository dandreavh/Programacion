package FicherosTextos;

import java.io.*;
import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreFichero;

        System.out.println("Indique el nombre del fichero");
        nombreFichero = sc.nextLine();

        BufferedReader in = null;// LECTURA
        BufferedWriter out = null; // ESCRITURA

        try {
            in = new BufferedReader(new FileReader(nombreFichero)); // LECTURA
            out = new BufferedWriter(new FileWriter("copia_de_"+nombreFichero)); // ESCRITURA

            String linea = in.readLine();

            // Bucle de control para el control de las líneas que
            while (linea!=null){
                out.write(linea+"\n"); // imporante añadirle el salto de línea
                linea = in.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            // MUY IMPORTANTE, cerrar los elementos de lectura y escritura
            try {
                in.close();
                out.close();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
