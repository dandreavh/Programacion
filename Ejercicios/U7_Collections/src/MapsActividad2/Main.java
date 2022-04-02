package MapsActividad2;

import java.util.HashMap;
import java.util.Scanner;

/*
Añada al programa anterior la siguiente funcionalidad. El programa pedirá al usuario un dni,
calculará la clave que ha de consultar, comprobará que dicha clave existe, y, en tal caso,
mostrará el valor asociado a esa clave en el HashMap.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> datos = new HashMap<>();
        String nombre1 = "Claudia";
        String dni;

        System.out.println("Escriba su dni");
        dni = sc.nextLine();

        do{
            System.out.println("Escriba su dni");
            dni = sc.nextLine();
            if(!dni.equalsIgnoreCase("fin")){
                if (datos.containsKey(calculaKey(dni))){
                    System.out.println("Ya existe: "+datos.get(calculaKey(dni)));
                }else {
                    datos.put(calculaKey(dni),nombre1);
                }
            }

        }while (!dni.equalsIgnoreCase("fin"));

    }
    public static Integer calculaKey(String dni){
        Integer result = 0;
        for (int i = 0; i < dni.length()-1; i++) {
            result += Character.getNumericValue(dni.charAt(i));
        }
        return result;
    }
}
