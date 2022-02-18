package Tarea1;

import java.io.*;
import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreFichero;

        System.out.println("Indique el nombre del fichero");
        nombreFichero = sc.nextLine();

        try {
            BufferedReader in = new BufferedReader(new FileReader(nombreFichero));

            BufferedWriter out = new BufferedWriter(new FileWriter("copia_de_"+nombreFichero));
            String linea = in.readLine();

            while (linea!=null){
                out.write(linea+"\n");
                linea = in.readLine();
            }

            in.close();
            out.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
