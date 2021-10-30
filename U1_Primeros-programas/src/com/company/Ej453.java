package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ej453 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a, b;

        System.out.println("Primer número decimal");
        a = sc.nextDouble();

        System.out.println("Segundo número");
        b  = sc.nextDouble();

        System.out.println("La división de sus números da " + (a/b));
    }
}
