package Actividad14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Implementar la función leeCadena con el siguiente prototipo:
List<Character> leeCadena()
Dicha función lee una cadena por teclado y nos la devuelve en una lista con un carácter en cada nodo.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;

        System.out.println("Escriba una cadena");
        cadena = sc.nextLine();

        System.out.println(leeCadena(cadena));
    }

    public static List<Character> leeCadena(String cadena){
        List<Character> characters = new ArrayList<>();

        for (int i = 0; i < cadena.length(); i++) {
            characters.add(cadena.charAt(i));
        }

        return characters;
    }
}
