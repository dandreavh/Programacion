package com.company;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String caracter_usuario;
        byte posicion;
        char caracter;

        System.out.println("Escriba el caracter que desea ver pintado en forma de piramide");
        caracter_usuario  = sc.nextLine();

        System.out.println("Escoja la orientación de la pirámide: 1) apunta hacia arriba, 2) apunta hacia abajo, 3) apunta a la derecha, 4) aounta a la izquierda");
        posicion = sc.nextByte();

        caracter = caracter_usuario.charAt(0);

        switch (posicion){
            case 1:
                System.out.println(" "+ " "+ caracter + " " + " ");
                System.out.println(" "+ (caracter) + (caracter) + (caracter) + " ");
                System.out.println(""+ caracter + ""+ (caracter) + ""+ (caracter) +""+ (caracter) +""+ (caracter));
                break;
            case 2:
                System.out.println(caracter + caracter + caracter + caracter + caracter);
                System.out.println(" "+ caracter + caracter + caracter + " ");
                System.out.println(" "+ " "+ caracter + " " + " ");
                break;
            case 3:
                System.out.println(caracter);
                System.out.println(caracter + caracter);
                System.out.println(caracter + caracter + caracter);
                System.out.println(caracter + caracter);
                System.out.println(caracter);
                break;
            case 4:
                System.out.println(" "+ " "+ caracter);
                System.out.println(" " + caracter + caracter);
                System.out.println(caracter + caracter + caracter);
                System.out.println(" " + caracter + caracter);
                System.out.println(" "+ " "+ caracter);
                break;
            default:
                System.out.println("Dirección de pirámide incorrecta.");
        }
    }
}
