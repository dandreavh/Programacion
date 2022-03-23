package FicherosBinarios.Actividad3;

import java.io.*;
import java.util.Scanner;

public class Main {
    /*
    Pedir números enteros positivos por consola y guardarlos en un fichero binario hasta que se introduzca
    un número negativo. Leer del fichero todos los enteros guardados y mostrarlos por pantalla.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ObjectOutputStream out = null;
        ObjectInputStream in = null;
        int cont = 0;

        // ESTRUCTURA PARA LA ESCRITURA DE LOS NÚMEROS
        try {
            FileOutputStream datos = new FileOutputStream("numerosEnteros.dat");
            out = new ObjectOutputStream(datos);
            int num;

            do{
                System.out.println("Escriba un número positivo para añadirlo o uno negativo para salir");
                num = sc.nextInt();
                out.writeInt(num);
                cont++;
            } while (num>-1);

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

        // ESTRUCTURA PARA MOSTRAR LOS NÚMEROS POR PANTALLA -- LECTURA
        try {
            FileInputStream datos = new FileInputStream("numerosEnteros.dat");
            in = new ObjectInputStream(datos);

            for (int i = 0; i < cont; i++) {
                int num = in.readInt();
                if(num>-1){
                    System.out.println("Número " + num);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{
                if (in != null){
                    in.close();
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
