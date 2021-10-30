package com.company;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, mayor, mediano, menor;

        System.out.println("Primer número:");
        n1 = sc.nextInt();
        System.out.println("Segundo número:");
        n2 = sc.nextInt();
        System.out.println("Tercer número:");
        n3 = sc.nextInt();

        if (n1>n2){
            mayor = n1;
            menor = n2;
        } else{
            mayor = n2;
            menor = n1;
        }

        if (n3>mayor && n3>menor){
            mayor = n3;
        } else{
            if (n3<mayor && n3<menor){
                menor = n3;
            }
        }

        if (n1!=menor && n1!=mayor){
            mediano = n1;
        } else if (n2!=menor && n2!=mayor){
            mediano = n2;
        } else if (n3!=menor && n3!=mayor){
            mediano = n3;
        } else{
            if (n1 == n2) {
                mediano = n2;
            }
            else {
                mediano = n3;
            }
        }

        System.out.println(mayor);
        System.out.println(mediano);
        System.out.println(menor);






    }
}
