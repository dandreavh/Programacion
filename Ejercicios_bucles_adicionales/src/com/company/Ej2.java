package com.company;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduzca un número");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i+"  ---  "+(i*i)+"  ---  "+(i*i*i));

        }
    }
}
