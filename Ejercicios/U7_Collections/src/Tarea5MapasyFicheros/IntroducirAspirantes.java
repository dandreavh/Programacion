package Tarea5MapasyFicheros;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class IntroducirAspirantes {
    private Map<Integer, Aspirante> mapaAspirantes = new TreeMap<>();
    ArrayList<Integer> aspirantesIds = new ArrayList<>();
    private static int id = 0;

    /*
    Tendrá un método InsertaAspirante, que recoge el nombre, el DNI y el teléfono del aspirante.
    La aplicación asigna un número identificativo incremental a cada aspirante.
    La aplicación pregunta cada vez que termina de insertarse un aspirante si quiere insertar otro más o no.
    En caso de que no, el proceso de inserción termina y se devuelve el control a la aplicación principal.
    Cuando se termine de recolectar todos los aspirantes, desde la aplicación principal,
    se llamará al método guardarFicheros, que generá dos ficheros:
    Uno que relacione el número de aspirante con la información del aspirante (se llamará aspirantes.dat);
    y otro, simplemente será una lista con los números identificativos de los aspirantes
    (que se llamará ids_aspirantes.dat). Ambos ficheros serán de tipo binario.
     */
    public void crearAspirante(){
        Scanner sc = new Scanner(System.in);
        String opcion = "s";
        String name;
        String dni;
        String phone;

        do{
            System.out.println("Indique el nombre:");
            name = sc.nextLine();
            System.out.println("Indique el dni:");
            dni = sc.nextLine();
            System.out.println("Indique el teléfono:");
            phone = sc.nextLine();

            insertaAspirante(name,dni,phone);

            System.out.println("Indique si quiere añadir otro empleado [s/n]");
            opcion = sc.nextLine();

        } while (opcion.equalsIgnoreCase("s"));
    }

    public void insertaAspirante(String name, String dni, String phone){
        id++;
        mapaAspirantes.put(id, new Aspirante(name, dni, phone));
        aspirantesIds.add(id);
    }

    public void guardarFicheros(){
        ObjectOutputStream out;
        try {
            out = new ObjectOutputStream(new FileOutputStream("aspirantes.dat"));

            out.writeObject(mapaAspirantes);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            out = new ObjectOutputStream(new FileOutputStream("aspirantes.dat"));

            out.writeObject(mapaAspirantes);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
