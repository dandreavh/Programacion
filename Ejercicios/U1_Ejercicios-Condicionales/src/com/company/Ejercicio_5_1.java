package com.company;

import java.util.Scanner;

public class Ejercicio_5_1 {
    //Ejercicio5-1: Crea un programa que pida un número entero al usuario y diga si es positivo
    // (mayor que cero) o si, por el contrario, no lo es (usando "else")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Escriba un número");
        num = sc.nextInt();

        if (num >= 0){
            System.out.println("Es Positivo");
        } else{
            System.out.println("Es Negativo");
        }
    }
}
