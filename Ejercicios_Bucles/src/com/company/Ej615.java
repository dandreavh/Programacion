package com.company;

import java.util.Scanner;

public class Ej615 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contra_user;
        final int CONTRASENA = 1234;

        System.out.println("Escriba una contraseña");
        contra_user = sc.nextInt();

        while (contra_user != CONTRASENA){
            System.out.println("Escriba otra contraseña");
            contra_user = sc.nextInt();
        }
    }
}
