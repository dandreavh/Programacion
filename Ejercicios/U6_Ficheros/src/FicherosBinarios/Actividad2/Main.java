package FicherosBinarios.Actividad2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    // Abrir el archivo del ejercicio anterior, leer el double y mostrarlo por pantalla
    public static void main(String[] args) {

        ObjectInputStream in = null;

        try {
            FileInputStream datos = new FileInputStream("numbers.dat");
            in = new ObjectInputStream(datos);
            double num = in.readDouble();
            System.out.println("Número " + num);
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
