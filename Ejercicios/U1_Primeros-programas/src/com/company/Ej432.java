package com.company;

import java.util.Scanner;

public class Ej432 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.println("Introduzca el primer número");
        a = sc.nextInt();
        System.out.println("Introduzca el segundo número");
        b = sc.nextInt();

        System.out.println("La división de sus números da como resultado " + (a/b));
    }
}
