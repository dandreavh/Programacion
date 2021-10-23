package com.company;

import java.util.Scanner;

public class Ej1 {
    // Escribe un programa que escriba por pantalla un par de Zs. La anchura de la Z deberá ser igual a la anchura y
    // la separación entre ambas Zs será de 3 espacios.
    // Se solicitará al usuario una altura que deberá ser siempre impar y mayor que 3. En caso contrario se volverá
    // a solicitar dicha altura.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int anchura;

        do{
            System.out.println("Escriba la anchura de la Z");
            anchura = sc.nextInt();
        } while (anchura<3 || anchura%2==0);

        for (int i = 0; i < anchura; i++) {
            for (int j = 0; j < anchura; j++) {
                if (i==0 || i==anchura-1){
                    System.out.print("X");
                } else{
                    if (i+j==anchura-1){
                        System.out.print("x");
                    } else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("   ");
            for (int j = 0; j < anchura; j++) {
                if (i==0 || i==anchura-1){
                    System.out.print("X");
                } else{
                    if (i+j==anchura-1){
                        System.out.print("x");
                    } else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }


    }
}
