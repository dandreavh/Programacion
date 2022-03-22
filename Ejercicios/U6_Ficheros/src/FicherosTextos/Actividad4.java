package FicherosTextos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Actividad4 {
    /*
    Realizar un programa que lea un fichero de texto llamado carta.txt,
    tenemos que contar los caracteres, las líneas y las palabras.
    Para facilitar el procesamiento supondremos que cada palabra está separada de otra
    por un único espacio en blanco.
     */
    public static void main(String[] args) {
        int cantCaracteres = 0;
        int cantLineas = 0;
        int cantPalabras = 0;

        try {
            BufferedReader in = new BufferedReader(new FileReader("carta.txt"));
            String linea = in.readLine();
            while (linea != null) {
                cantLineas++;
                cantCaracteres += linea.length();
                cantPalabras += esPalabra(linea);

                linea = in.readLine();

            }
            in.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("El fichero tiene " + cantLineas + " líneas, "
                            + cantPalabras + " palabras y "
                            + cantCaracteres + " caracteres");
    }

    private static int esPalabra(String linea) {
        int cantP = 0;
        for (int i = 0; i < linea.length(); i++) {
            if(linea.charAt(i)!=' '){
                cantP++;
            }
        }
        return cantP;
    }
}
