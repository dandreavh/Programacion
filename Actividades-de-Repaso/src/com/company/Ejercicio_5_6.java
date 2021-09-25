package com.company;

import java.util.Scanner;

public class Ejercicio_5_6 {
    //Ejercicio5-6: Crea un programa que contenga una constante llamada gravedad=9,8,
    // solicite al usuario el valor de "tiempo", y calcule y muestre la velocidad (velocidad=gravedad x tiempo).
    // Nota: si el valor del tiempo es negativo o 0, se mostrará el mensaje "Tiempo incorrecto"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double gravedad = 9.8;
        double tiempo, velocidad;

        System.out.println("Introduzca un valor para tiempo");
        tiempo = sc.nextDouble();

        if (tiempo<0){
            System.out.println("Tiempo incorrecto");
        } else{
            velocidad = gravedad*tiempo;
            System.out.println("La velocidad es de " + velocidad);
        }
    }
}
