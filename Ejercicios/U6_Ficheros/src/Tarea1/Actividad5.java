package Tarea1;

import java.io.*;
import java.util.Arrays;

public class Actividad5 {
    /*
    En el archivo numeros.txt disponemos de una serie de números (uno por cada línea).
    Diseñar un programa que procese el fichero y nos muestre el menor y el mayor.
     */
    public static void main(String[] args) {
        int n;
        int mayor  = 0;
        int menor = 0;
        try {
            BufferedReader in = new BufferedReader(new FileReader("numeros.txt"));

            String linea = in.readLine();

            mayor = Integer.parseInt(linea);
            menor = Integer.parseInt(linea);

            while (linea!=null){
                n = Integer.parseInt(linea);

                if(n > mayor){
                    mayor = n;
                }
                if(n < menor){
                    menor = n;
                }
                linea = in.readLine();
            }

            in.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Mayor " + mayor);
        System.out.println("Menor " + menor);
    }
}
