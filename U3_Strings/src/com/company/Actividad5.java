package com.company;

import java.util.Scanner;

public class Actividad5 {
    // Pedir el nombre completo (nombre y apellidos) al usuario.
    // El programa debe eliminar cualquier vocal del nombre.
    // Por ejemplo: "Álvaro Pérez" se mostrará como "lvr Prz".
    // Sólo se eliminarán las vocales (mayúsculas, minúsculas y acentuadas).
    // El resto de caracteres no se modifican.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, nombreSinVocales = "";
        char caracter;


        System.out.println("Escriba su nombre");
        nombre = sc.nextLine();

        for (int i = 0; i < nombre.length(); i++) {
            caracter = nombre.charAt(i);

           if(caracter!='a' && caracter!='e' && caracter!='i' && caracter!='o' && caracter!='u'){
               nombreSinVocales += caracter;
           }

        }

        System.out.println(nombreSinVocales);
    }
}
