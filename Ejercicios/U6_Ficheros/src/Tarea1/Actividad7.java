package Tarea1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Actividad7 {
    /*
    En LINUX disponemos de un comando "more", al que se le pasa un fichero y lo muestra poco a poco
    (cada 24 líneas). Implementar un programa que funcione de forma similar.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int PARADA = 24;
        int contador = 0;

        try {
            BufferedReader salida = new BufferedReader(new FileReader("texto.txt"));
            String linea = salida.readLine();

            while (linea!=null){
                System.out.println(linea);
                contador++; // Me va imprimiendo línea a línea y aumenta el contador

                if (contador==PARADA){ // cuando el contador llega a 24
                    System.out.println("Clique enter para ver más líneas");
                    sc.nextLine();
                    contador = 0;
                }
                linea = salida.readLine();
            }

        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}
