package Actividad4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/*
Introducir por consola una frase que conste exclusivamente de palabras separadas por espacios.
Almacenar en una lista las palabras de la frase, una en cada nodo y mostrar por pantalla las palabras
que estén repetidas. A continuación, mostrar las que no lo estén.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence;
        String[] words;
        ArrayList<String> myList = new ArrayList<>();

        System.out.println("Escriba una frase separada por espacios");
        sentence = sc.nextLine();

        words = sentence.split(" "); // el 'split' va dividiendo el string cuando encuenta espacio, y cada elemento que encuenta lo almacena en el array

        for (String s: words) {
            myList.add(s);
        }

        Iterator it = myList.iterator();

        while (it.hasNext()){
            String element = (String) it.next();

            if (myList.lastIndexOf(element)!=myList.indexOf(element)){ // si tiene índices distintos es porque hay repetidos

                // REPETIR MÉTODO DE REPETIDOS
            }
        }
    }
}
