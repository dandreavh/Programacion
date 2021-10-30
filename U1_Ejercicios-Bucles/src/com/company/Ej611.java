package com.company;

import java.util.Scanner;

public class Ej611 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Escriba un número");
        num = sc.nextInt();

        while (num<=10){
            System.out.println(num);
            num++;
        }
    }
}
