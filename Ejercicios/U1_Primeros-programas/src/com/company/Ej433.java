package com.company;

import java.util.Scanner;

public class Ej433 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Introduzca el primer número");
        a = sc.nextInt();
        System.out.println("Introduzca el segundo número");
        b = sc.nextInt();
        System.out.println("El resto de la división de sus dos números es de " + (a%b));
    }
}
