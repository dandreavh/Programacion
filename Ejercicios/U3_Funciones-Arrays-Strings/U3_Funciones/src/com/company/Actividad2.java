package com.company;

import java.util.Scanner;

public class Actividad2 {
    //Actividad 2: Diseñar una  función a la que se le pasen dos enteros y
    // muestre todos los números comprendidos entre ellos.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Escriba el primer número");
        num1 = sc.nextInt();
        System.out.println("Escriba el segundo número");
        num2 = sc.nextInt();

        numerosComprendidos(num1, num2);
    }

    public static void numerosComprendidos(int n1, int n2) {
        int menor, mayor;

        if (n2<n1){
            menor = n2;
            mayor = n1;
        } else{
            menor = n1;
            mayor = n2;
        }

        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
    }
}
