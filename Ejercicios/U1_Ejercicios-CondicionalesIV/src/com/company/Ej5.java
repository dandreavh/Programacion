package com.company;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b;

        System.out.println("Designe un valor para 'a'");
        a = sc.nextFloat();
        System.out.println("Designe un valor para 'b'");
        b = sc.nextFloat();

        if (b==0 || a==0){
            System.out.println("No tiene una solución real");
        } else{
            if (b>0){
                System.out.println("x = " + ((-b)/a));
            } else{
                System.out.println("x = " + ((+b)/a));
            }
        }
    }
}
