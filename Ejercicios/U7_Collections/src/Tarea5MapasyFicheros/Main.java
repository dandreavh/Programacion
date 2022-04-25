package Tarea5MapasyFicheros;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Map<String, Aspirante> aspirantes = new TreeMap<>();

        do{
            showMenu();
            System.out.println("Indique una opción");
            opcion = sc.nextInt();

            switch (opcion){
                case 1: // IntroducirAspirantes:
                    break;
                case 2: // CalificacionPruebas:
                    break;
                case 3: // Aprobados: que genera un listado con los aspirantes que han superado las oposiciones.
                    break;
                case 4:
                    break;
            }

        } while (opcion<5);
    }

    public static void showMenu(){
        System.out.println("1. Introducir datos de aspirantes");
        System.out.println("2. Calificar prueba");
        System.out.println("3. Aprobados");
        System.out.println("4. Salir");
    }
}
