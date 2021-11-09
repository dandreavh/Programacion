package com.company;

import java.util.Scanner;

public class Condiciones_5_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Escriba el número 12");
        num = sc.nextInt();

        if (num == 12){
            System.out.println("Ha acertado");
        } else{
            System.out.println("Se ha equivocado");
        }
    }
}
