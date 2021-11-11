package com.company;

import java.util.Scanner;

public class Ej543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, numPares;

        System.out.println("Escriba un número");
        num1 = sc.nextInt();
        System.out.println("Escriba otro número");
        num2 = sc.nextInt();
        System.out.println("Indique cuántos son pares: los 2, solo 1 o ninguno 0");
        numPares = sc.nextInt();

        if((num1 %2==0) && (num2%2==0)){
            System.out.println("Los DOS son pares");
            if (numPares == 2){
                System.out.println("Usted ha acertado");;
            } else{
                System.out.println("Se ha equivocado");
            }
        } else{
            if (!(num1%2==0) && !(num2%2==0)){
                System.out.println("Ninguno es par");
                if (numPares == 0){
                    System.out.println("Usted ha acertado");;
                } else{
                    System.out.println("Se ha equivocado");
                }
            } else{
                System.out.println("Uno de los dos es par");
                if (numPares == 1){
                    System.out.println("Usted ha acertado");;
                } else{
                    System.out.println("Se ha equivocado");
                }
            }
        }


    }
}
