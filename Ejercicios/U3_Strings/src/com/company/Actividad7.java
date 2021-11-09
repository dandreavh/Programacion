package com.company;

import java.util.Scanner;

public class Actividad7 {
    // En una segunda versión del programa anterior, se debe escribir "Acertaste" o "Menor" o "Mayor",
    // según la palabra introducida sea menor alfabéticamente que la contraseña, o mayor.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasena1, contrasena2;
        int cantCaracteres = 0;
        char primero, ultimo;

        System.out.println("Jugador 1, introduzca una contraseña");
        contrasena1 = sc.nextLine();

        cantCaracteres = contrasena1.length();
        primero = contrasena1.charAt(0);
        ultimo = contrasena1.charAt(contrasena1.length()-1);

        System.out.println("Pistas: la contraseña tiene " +cantCaracteres+ " caracteres, el primer caracter es "
                +primero+ " y el último es " +ultimo);

        System.out.println("Jugador 2, intente adivinar");
        contrasena2 = sc.nextLine();

        if(contrasena2.compareTo(contrasena1)==0){
            System.out.println("Acertaste");
        } else if (contrasena2.compareTo(contrasena1)>0){
            System.out.println("La contraseña es menor");
        } else if (contrasena2.compareTo(contrasena1)<0){
            System.out.println("La contraseña es mayor");
        }
    }
}
