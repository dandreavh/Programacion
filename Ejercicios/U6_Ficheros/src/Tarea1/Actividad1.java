package Tarea1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        /*
        Realizar un programa que solicite al usuario el nombre de un fichero de texto y
        muestre su contenido en pantalla. Si no se proporciona ningún nombre de fichero,
        la aplicación utilizará por defecto "prueba.txt".
         */
        Scanner sc = new Scanner(System.in);
        String texto = "";
        String nombreFichero = "";

        System.out.println("Introduzca el nombre del fichero");
        nombreFichero = sc.nextLine();
        if(nombreFichero.equals("")){
            nombreFichero = "prueba.txt";
        }

        // primerfichero.ghex

        // LECTURA CARACTER A CARACTER
        try {
            FileReader in = new FileReader(nombreFichero);
            int caracter = in.read();
            while (caracter != -1) {
                texto += (char) caracter;
                caracter = in.read();
            }
            in.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(texto);

        // LECTURA LÍNEA A LÍNEA
        try {
            BufferedReader inB = new BufferedReader(new FileReader(nombreFichero));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
