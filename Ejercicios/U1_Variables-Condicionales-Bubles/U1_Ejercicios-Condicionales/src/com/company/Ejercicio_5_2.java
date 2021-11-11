package com.company;

import java.util.Scanner;

public class Ejercicio_5_2 {
    //Ejercicio5-2: Crea un programa que pida al usuario que introduzca el número 12.
    // Después debe decirle si lo ha hecho correctamente o no.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduzca el número 12");
        num = sc.nextInt();

        if(num == 12){
            System.out.println("Ha acertado");
        } else{
            System.out.println("Se ha equivocado");
        }
    }
}
