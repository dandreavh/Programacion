package com.company;

import java.util.Scanner;

public class Actividad2 {
    // Introducir por teclado una frase palabra a palabra,
    // y mostrar la frase completa separando las palabras introducidas con espacios en blanco.
    // Terminar de leer la frase cuando la palabra introducida sea "fin" escrita con cualquier combinación
    // de mayúsculas/minúsculas.
    // La cadena "fin" no aparecerá en la frase final.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabras = "", frase = "";

        System.out.println("Escriba las palabras de su frase");

        while(!palabras.equalsIgnoreCase("fin")){
            frase += palabras + " ";
            palabras = sc.nextLine();
        }

        System.out.println(frase);

    }
}
