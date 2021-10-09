package com.company;

import java.util.Scanner;

public class Ej616 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int login_use, passw_user;
        final int LOGIN = 18009, PSSWORD = 1234;

        System.out.println("Escriba su código de usuario");
        login_use = sc.nextInt();
        System.out.println("Escriba su contraseña");
        passw_user = sc.nextInt();

        while(login_use != LOGIN && passw_user != PSSWORD){
            System.out.println("Escriba otro código de usuario");
            login_use = sc.nextInt();
            System.out.println("Escriba otra contraseña");
            passw_user = sc.nextInt();
        }
    }
}
