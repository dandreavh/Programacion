package FicherosTextos;

import java.io.*;
import java.util.Scanner;

public class Actividad6 {
    /*
    Un libro de firmas es útil para recoger todas las personas que han pasado por un determinado lugar.
    Crear una aplicación que permita mostrar el libro de firmas o insertar un nuevo nombre
    (comprobando que no se encuentre repetido). Llamaremos al fichero firmas.txt.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firma;
        boolean estaFirma = false;

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("firmas.txt", true));
            System.out.println("Escriba su firma");
            firma = sc.nextLine();

            BufferedReader in = new BufferedReader(new FileReader("firmas.txt"));
            String linea = in.readLine();

            while (linea!=null){
                if(linea.equals(firma)){
                    estaFirma = true;
                    break;
                } else{
                    estaFirma = false;
                }
                linea = in.readLine();
            }

            if(!estaFirma){
                out.write(firma + "\n");
            } else{
                System.out.println("Ya está registrado en el libro de firmas");
            }

            in.close();
            out.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
