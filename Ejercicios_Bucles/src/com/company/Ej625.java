package com.company;

import java.util.Scanner;

public class Ej625 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_log, user_pass, login = 1809, password = 1234;

        do{
            System.out.println("Escriba su número de usuario");
            user_log = sc.nextInt();
            System.out.println("Escriba la contraseña");
            user_pass = sc.nextInt();
        } while (user_log!=login || user_pass!=password);
    }
}
