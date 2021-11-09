package com.company;

import java.util.Scanner;

public class Ej617 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cant, num =0;

        System.out.println("Indique cuántos asteriscos quiere");
        cant = sc.nextInt();

        while (num<cant){
            System.out.println("*");
            num++;
        }
    }
}
