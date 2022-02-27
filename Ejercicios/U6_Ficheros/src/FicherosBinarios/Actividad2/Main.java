package FicherosBinarios.Actividad2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    // Abrir el archivo del ejercicio anterior, leer el double y mostrarlo por pantalla
    public static void main(String[] args) {

        FileInputStream archivo = null;
        ObjectInputStream in = null;

        try {
            archivo = new FileInputStream("numbers.dat");
            in = new ObjectInputStream(archivo);
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null){
            }
        }

    }
}
